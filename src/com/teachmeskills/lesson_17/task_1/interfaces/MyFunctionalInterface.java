package com.teachmeskills.lesson_17.task_1.interfaces;

import com.teachmeskills.lesson_17.task_1.exception.CustomException;

@FunctionalInterface
public interface MyFunctionalInterface<T, R> {
    R execute(T input) throws CustomException;
}