package br.edu.ifpb.dac.sistemadehorarios.entity.Lesson.utils.filters;

import br.edu.ifpb.dac.sistemadehorarios.entity.Lesson.LessonRepository;
import br.edu.ifpb.dac.sistemadehorarios.entity.Lesson.LessonModel;

import java.util.List;

public class FilterByCourse extends Filter{

    private String filter;
    private LessonRepository repository;

    public FilterByCourse(String filter, LessonRepository repository) {
        this.filter=filter;
        this.repository=repository;
    }

    @Override
    public List<LessonModel> filter(List<LessonModel> list) {
        if(!this.filter.equals("null")){
            return this.repository.getByCourseModelFilter(filter);
        }
        return list;
    }
}
