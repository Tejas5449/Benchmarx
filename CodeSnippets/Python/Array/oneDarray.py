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

# creating the list
list = [100, 200, 300, 400]

# creating 1-d array
n = np.array(list)
print(n)


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
