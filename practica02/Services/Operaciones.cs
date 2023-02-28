using System;
using WSDL.mensajes;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WSDL.operaciones
{
    public class Operaciones : Mensajes
    {
         List<string> personNames = new List<string>();
        public string Saludar(string nombre)
        {
            string msj = "Hola " + nombre;
            personNames.Add(nombre);
            foreach(string item in personNames)
            {
                Console.WriteLine(item);
            }
            return msj; 
            
            
        }
        public string Mostrar(int id)
        {
            //string name = personNames[id];
            return personNames[id];
        }
    }
}