#! /usr/bin/python
import datetime
# import monary


class Employee:

    raise_amount = 1.04

    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def raise_salary(self, amount):
        desc = "{}'s salary is {}, and raise_amount is {} .".format(self.name, self.salary, amount)
        return desc

    @classmethod
    def raise_salary_cls(cls):
        desc = "Employee raise_amount is {} .".format(cls.raise_amount)
        return desc

    @classmethod
    def set_raise_amount(cls, amount):
        cls.raise_amount = amount

    @classmethod
    def from_string(cls, employee_str):
        name, salary = employee_str.split('-')
        return cls(name, salary)

    @staticmethod
    def is_weekday(day):
        if day.weekday() == 5 or day.weekday() == 6:
            return True
        else:
            return False


def main():
    employee = Employee('Robin', '3500')
    print(employee.raise_salary(1.05))
    print(employee.raise_amount)
    Employee.set_raise_amount(1.06)
    print(employee.raise_salary_cls())
    print(employee.raise_amount)

    employee2 = Employee('Charlie', '3600')
    print(employee2.raise_salary_cls())
    Employee.set_raise_amount(1.07)

    employee3 = 'Rose-2000'
    employee_rose = Employee.from_string(employee3)
    print(employee_rose.raise_salary(1.08))

    my_date = datetime.date(2018, 7, 8)
    print(Employee.is_weekday(my_date))


if __name__ == '__main__':
    main()
