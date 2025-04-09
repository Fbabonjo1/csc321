#Fatoma Babonjo

def rectangle(base,height):
    rectarea = base *height
    return rectarea

def circle(radius):
    circarea = 3.14 *radius**2
    return circarea


x = int(input("Enter the rectangle's base: "))
y = int(input("Enter the rectangle's height: "))
z = int(input("Enter the circle's radius: "))

rectangleArea = rectangle(x,y)
circleArea = circle(z)

print("The area of the rectangle is: ",rectangleArea)
print("The area of the circle is: ",circleArea)



