package primos;

public class primos {
	
	public static int[]generarprimos(int max)
	{
		int i,j;
		if(max>=2)
		{
			
			int dim=max+1;
			boolean[] esprimo=new boolean[dim];
			
			for(i=0;i<dim;i++)
			{
				esprimo[i]=true;
				
			}
			esprimo[0]=esprimo[1]=false;
			
			for(i=2;i<Math.sqrt(dim)+1;i++)
			{
				if (esprimo[i])
				{
					for(j=2*i;j<dim;j+=i)
						esprimo[j]=false;
				}
			}
			int cuenta=0;
			for(i=0;i<dim;i++)
			{
				if (esprimo[i])
				cuenta++;
			}
			int []primos=new int[cuenta];
			for(i=0,j=0;i<dim;i++)
			{
				if(esprimo[i])
					primos[j++]=i;
			}
			return primos;
			
		}
		else
		{
			return new int[0];
		}
	}

}
