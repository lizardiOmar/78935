using System;
using System.ServiceModel;
using WSDL.mensajes;

namespace WSDL.operaciones
{
    public class Operaciones : Mensajes
    {
        public String Saludar(string nombre)
        {
            string msg ="Hola "+nombre;
            return msg;
        }
        public int Mostrar(int id)
        {
            return id;
        }
    }
}
