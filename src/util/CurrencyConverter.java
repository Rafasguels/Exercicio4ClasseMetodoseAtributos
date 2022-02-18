package util;

public class CurrencyConverter {
		public static final double IOF = 0.06;
		
		public static double reais(double cotacao, double compraD) {
			return cotacao * compraD * (1.0 + IOF);
		}
}
