import time
#from xml.dom.minidom import TypeInfo
import os
import psutil
import timeit
import numpy as np

# starting time
#start = time.time()
# print(type(start))
t = time.process_time()

start = time.time_ns()
# program body starts

# Python Program to depict multiple inheritance
# when every class defines the same method


class Class1:
    def m(self):
        print("In Class1")


class Class2(Class1):
    def m(self):
        print("In Class2")


class Class3(Class1):
    def m(self):
        print("In Class3")


class Class4(Class2, Class3):
    def m(self):
        print("In Class4")


obj = Class4()
obj.m()

Class2.m(obj)
Class3.m(obj)
Class1.m(obj)


# sleeping for 1 sec to get 10 sec runtime
# time.sleep(1)
print(psutil.Process(os.getpid()).memory_info().rss / 1024 ** 2)
process = psutil.Process(os.getpid())
print(process.memory_info().rss)  # in bytes

# program body ends

# end time
#end = time.time()
end = time.time_ns()
elapsed_time = time.process_time() - t
print(elapsed_time)

# total time taken
print(f"Runtime of the program is {end - start}")
