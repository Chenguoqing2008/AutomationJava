# from os import path
import os

# print(os.path.curdir)
print(os.path.abspath(os.path.curdir))
print(os.listdir())
print(os.name)
print(os.path.basename(os.getcwd()))
print(os.path.pardir)
print(os.path.abspath(os.path.pardir))
os.chdir(os.path.abspath(os.path.pardir))
print(os.listdir())
print(os.getcwd())


print(os.path.join(os.path.abspath(os.path.pardir), 'data'))

test_path = os.path.join(os.path.abspath(os.path.pardir), 'data')

if 'data' in os.listdir(os.pardir):
    print('hello')
    print()
    print(os.path.join(os.listdir(os.pardir), 'data'))


for dirpath, dirname, filename in os.walk(os.pardir):
    print('Current Path', dirpath)
    print('Directories', dirname)
    print('Files', filename)
    print()
