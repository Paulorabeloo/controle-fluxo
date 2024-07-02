// Modo condicional switch/case
public class PlanoOperadora 
{
	public static void main(String[] args) 
    {
		String plano = "T"; // pega todos planos, se for M = Wpp e Insta e 100 minutos e se for B = 100 minutos apenas.

		switch (plano) // sem break
        {
			case "T": 
            {
				System.out.println("5Gb Youtube");
			}
			case "M": 
            {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": 
            {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}