#!/usr/bin/python
import matplotlib.pyplot as plt
import numpy as np
import sys

if len(sys.argv) == 2:
    img = plt.imread(sys.argv[1])
    print(np.array_str(img))
else :
    sys.exit("Give the path of the image")