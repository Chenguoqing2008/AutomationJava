#! /usr/bin/python
# _*_ coding: utf-8 _*_


# def m():
#     return lambda x: 2*x
#
#
# def mx():
#     return lambda x, y: x if x > y else y


# def get_full_name():
#     return lambda fn, ln: fn.strip().title() + " " + ln.strip().title()


# Quadratic Functions
# f(x) = ax**2 + b*x +c


def build_quadratic_function(a, b, c):
    return lambda x: a*x**2 + b*x + c


# print(m(2))
# print(mx(3, 4))
# print(get_full_name(" leonhard", "EULER"))
f = build_quadratic_function(2, 3, 4)
print(f(2))


