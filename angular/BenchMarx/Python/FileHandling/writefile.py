import time
#from xml.dom.minidom import TypeInfo
import os
import psutil
import timeit


# starting time
#start = time.time()
# print(type(start))
t = time.process_time()

start = time.time_ns()
# program body starts
# Python program to demonstrate
# writing to file

# Opening a file
file1 = open('myfile.txt', 'w')
L = ["This is Delhi \n", "This is Paris \n", "This is London \n"]
s = "Hello\n"

# Writing a string to file
file1.write(s)

# Writing multiple strings
# at a time
file1.writelines(L)

# Closing file
file1.close()

# Checking if the data is
# written to file or not
file1 = open('myfile.txt', 'r')
print(file1.read())
file1.close()


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
