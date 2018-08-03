#! /usr/bin/python


def wrapper_function(execution_function):
    def wrapper_executor(*args, **kwargs):
        print("begin to execute wrapper function", execution_function.__name__)
        result = execution_function(*args, **kwargs)
        print("after execution wrapper function", execution_function.__name__)
        return result
    return wrapper_executor


@wrapper_function
def test_decorator(name, age):
    print('display the user name：{} and age：{} '.format(name, age))


test_decorator('robin', 23)

# @wrapper_function is a alias of def wrapper_function
# return wrapper_executor actual returns a value and the value is result
# pass function as a parameter
# executed function only have definition, but don't have implementation


