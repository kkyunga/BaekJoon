#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    double d = ((double)num1 / num2);
    int result = d * 1000;
    return result;
}