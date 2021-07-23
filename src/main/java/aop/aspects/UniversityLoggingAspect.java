package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice:  логгируем получения списка студентов перед методом getStudents" );
//    }


//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "MR. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double averageGrade =firstStudent.getAvgGrade();
//        averageGrade = averageGrade + 1;
//        firstStudent.setAvgGrade(averageGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice:  логгируем получения списка студентов после  работы метода getStudents" );
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice:  логируем выброс исключения "+ exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice:  логируем нормальное окончание работы метода или выброс исключения");
    }

}
