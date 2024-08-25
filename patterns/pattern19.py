# **********
# ****  ****
# ***    ***
# **      **
# *        *
# *        *
# **      **
# ***    ***
# ****  ****
# **********

num = int(input("Enter a number: "))

for i in range(num, 0, -1):
  stars = "*" * i
  spaces = "  " * (num - i)
  print(stars + spaces + stars)

for i in range(1, num + 1):
  stars = "*" * i
  spaces = "  " * (num - i)
  print(stars + spaces + stars)
