package ru.itdt.mobile.sample.order.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itdt.mobile.sample.order.domain.Preference;
import ru.itdt.mobile.sample.order.domain.Teacher;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentShort {
    private Long id;
    private String name;
}
