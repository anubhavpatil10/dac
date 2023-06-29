
package emp;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ioutils {
//       
//	  static void storeEmpDetails(String filename,Map<String,Employee> list) throws IOException{
//		  try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
//			  out.writeObject(list);
//		  }
//	  }
//	  @SuppressWarnings("unchecked")
//	static Map<String,Employee> restoreEmpDetails(String filename) throws IOException,ClassNotFoundException{
//		  try(ObjectInputStream retin = new ObjectInputStream(new FileInputStream(filename))){
//			  return (Map<String,Employee>)in.readObject();
//		  }
//		  catch (Exception e) {
//			  System.out.println("Err in Deserialization"+e);
//		       return new HashMap<>();
//		}
//	  }
//}
   static void StoreEmpdetails(String filename,Map<String,Employee> list) throws IOException{
	   try (ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(filename))){
		   out.writeObject(list);
	   }
   }
	   
	   @SuppressWarnings("unchecked")
	static Map<String,Employee> restoreEmpdetails(String filename) throws IOException,ClassNotFoundException{
		   try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
			   return(Map<String,Employee>)in.readObject();
			   
		   }
			catch (Exception e) {
				System.out.println("err in deserialixation"+e);
				return new HashMap<>();
			}   
		   }
		   
		   
	   
	   }
   

