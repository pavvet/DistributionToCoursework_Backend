package ru.itdt.mobile.sample.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.itdt.mobile.sample.order.bean.CourseworkShort;
import ru.itdt.mobile.sample.order.bean.PairStudentCoursework;
import ru.itdt.mobile.sample.order.bean.StudentDTO;
import ru.itdt.mobile.sample.order.bean.StudentShort;
import ru.itdt.mobile.sample.order.bean.request.StudentPostRequest;
import ru.itdt.mobile.sample.order.bean.response.AuthStudentResponse;
import ru.itdt.mobile.sample.order.domain.Student;

@Mapper(componentModel = "cdi",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DistributionMapper {
    PairStudentCoursework mapToPair(StudentShort student, CourseworkShort coursework);
}
