public class factorialRecursion
{

	private double factorial(int currentNumber)
	{
		double facValue = 0;
		if (currentNumber >= 0)
		{

			if (currentNumber <= 1)
			{
				return 1;
			}
			else
			{
				return currentNumber * factorial(currentNumber - 1);
			}
		}

		return facValue;

	}

	public void Start()
	{
		int factCount = 10;
		
		for (int count = 0; count < factCount; count++)
		{
			System.out.println(factorial(count));
		}

		System.out.println(factorial(factCount));

	}
}
