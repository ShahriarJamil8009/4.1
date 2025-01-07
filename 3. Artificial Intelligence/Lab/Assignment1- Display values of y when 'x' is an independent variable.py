import numpy as np
import matplotlib.pyplot as plt

# universal statement
plt.figure(figsize=(15, 12))
x = np.arange(-10, 10, 0.1)

# first equation
w = 1
b = 2
y = w * x + b
plt.subplot(3,3,1)
plt.plot(x, y)
plt.title("y = wx + b")
plt.grid()
plt.legend()
plt.tight_layout()

# second equation
y = x*x
plt.subplot(3,3,2)
plt.plot(x, y)
plt.title("y = x^2")
plt.grid()
plt.legend()
plt.tight_layout()

# third equation
y = 1 / (1 + np.pow(np.e,(-x)))
plt.subplot(3,3,3)
plt.plot(x, y)
plt.title("y = 1/ (1 + e^(-x))")
plt.grid()
plt.legend()
plt.tight_layout()

#fourth equation
y = (np.pow(np.e,x) - np.pow(np.e,(-x))) / (np.pow(np.e,x) - np.pow(np.e,(-x)))
plt.subplot(3,3,4)
plt.plot(x, y)
plt.title("y = (e^x - e^(-x)) / (e^x - e^(-x))")
plt.grid()
plt.legend()
plt.tight_layout()

#fifth equation
u = w * x + b
y = 1 / (1 + np.pow(np.e,(-u)))
plt.subplot(3,3,5)
plt.plot(x, y)
plt.title("y = 1/ (1 + e^(-u))")
plt.grid()
plt.legend()
plt.tight_layout()

# sixth equation
y = (np.pow(np.e,u) - np.pow(np.e,(-u))) / (np.pow(np.e,u) + np.pow(np.e,(-u)))
plt.subplot(3,3,6)
plt.plot(x, y)
plt.title("y = (e^u - e^(-u)) / (e^u + e^(-u))")
plt.grid()
plt.legend()
plt.tight_layout()

#seventh equation
w1 = 2
b1 = 4
y1 = w1 * x + b1
w2 = 6
b2 = 8
y2 = w2 * x + b2
w3 = 10
w4 = 12
b = 14
w = (w3 * y1) + (w4 * y2) + b
y = 1 / (1 + np.pow(np.e,(-w)))
plt.subplot(3,3,7)
plt.plot(x, y)
plt.title("y = 1/ (1 + e^(-w))")
plt.grid()
plt.legend()
plt.tight_layout()
plt.show()