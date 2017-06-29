import  numpy as np
from random import *

mega = []

while len(mega) < 6:
    number = randint(1,60)
    if number not in mega:
        mega.append(number)

mega.sort()

print ( mega )
