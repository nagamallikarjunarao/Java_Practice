import java.util.*;
class InvalidMobilenumberException extends Exception
  {
    public InvalidMobilenumberException(String msg)
    {
      super(msg);
    }
  }
 class Exception
  {
    public  static void validate(String mobilenumber) throws InvalidMobilenumberException
    {
      if(mobilenumber.length()<10)
      {
        throw new InvalidMobilenumberException("invalid mobile number");
      }
      else{
        System.out.println(mobilenumber);
      }
    }
    public static void main(String args[])
    {
      try{
        validate("1234567756");
      }
      catch(InvalidMobilenumberException ex)
        {
          System.out.println(ex);
        }
    }
    
  }

    
