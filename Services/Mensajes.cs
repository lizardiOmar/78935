using System;
using System.ServiceModel;

namespace WSDL.mensajes
{
	[ServiceContract]
	public interface Mensajes
	{
		[OperationContract]
		string Saludar(string nombre);
		[OperationCOntract]
		string mostrar(int id);
	}
}	
