package codigo;

public class CodigoCalculadora {
	public static String sumar (String a, String b) {
  	  String respuesta = "";
  	  respuesta = (Integer.parseInt(a)+Integer.parseInt(b))+"";
  	  return respuesta;
    }
    public static String resta (String a, String b) {
  	  String respuesta = "";
  	  respuesta = (Integer.parseInt(a)-Integer.parseInt(b))+"";
  	  return respuesta;
    }
    public static String multiplicar (String a, String b) {
  	  String respuesta = "";
  	  respuesta = (Integer.parseInt(a)*Integer.parseInt(b))+"";
  	  return respuesta;
    }
    public static String dividir (String a, String b) {
  	  String respuesta = "";
  	  try {
  	  respuesta = (Integer.parseInt(a)/Integer.parseInt(b))+"";
  	  }
  	  catch (Exception e) {
  		  respuesta= "Error al dividir por cero";
  	  }
  	  return respuesta;
    }
}
