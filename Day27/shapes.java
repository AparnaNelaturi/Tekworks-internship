class Shape
  {
    public static void main(String args[])
    {
      try{
        Circle circle=new Circle(3);
        System.out.println("circle area is :"+circle.getArea());
        System.out.println("circle perimeter is :"+circle.getPerimeter());
        Triangle triangle=new Triangle(1,3,5);
        System.out.println("Triangle area is :"+triangle.getArea());
        System.out.println("Triangle perimeter is :"+triangle.getPerimeter());
        Rectangle rectangle=new Rectangle(4,6);
        System.out.println("rectangle area is :"+rectangle.getArea());
        System.out.println("rectangle perimeter  is :"+rectangle.getPerimeter());
        Triangle invalidTriangle=new Triangle(1,2,3);
      }
      catch(Exception e)
        {
          System.out.println("Invalid dimensions :"+e.getMessage());
        }
    }
  }
class Circle extends Shape
  {
    double radius;
    Circle(double radius)throws Exception
    {
      if(radius<=0)
      {
        throw new Exception("Radius must be greater than 0");
      }
      this.radius=radius;
    }
    double getArea()
    {
      return 3.14*radius*radius;
    }
    double getPerimeter()
    {
      return 2*3.14*radius;
    }
  }
class Triangle extends Shape{
  double side1;
  double side2;
  double side3;
  Triangle(double side1,double side2,double side3)throws Exception
  {
    if(side1<=0 || side2<=0 || side3<=0)
    {
      throw new Exception("All sides must be greater than 0");
    }
    if(side1+side2<=side3 || side2+side3<=side1 || side3+side1<=side2)
    {
      throw new Exception("Invalid side length for a triangle");
    }
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;
  }
  double getArea()
  {
    double s=(side1+side2+side3)/2;
    return Math.sqrt(s*(s-side1)*(s=side2)*(s-side3));
  }
  double getPerimeter()
  {
    return side1+side2+side3;
  }
}
class Rectangle extends Shape
  {
    double length;
    double width;
    Rectangle(double length,double width)throws Exception
    {
      if(length<=0 || width<=0)
      {
        throw new Exception("Dimensions must be positive");
      }
      this.length=length;
      this.width=width;
    }
    double getArea()
    {
      return length*width;
    }
    double getPerimeter()
    {
      return 2*(length+width);
    }
  }
class InvalidDimensionException extends Exception
  {
    InvalidDimensionException(String message)
    {
      super(message);
    }
  }
