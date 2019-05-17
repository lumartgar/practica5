public class Sueldo {

	public double calculaBruto(char tipoTrab, double ventas) {
		int fijo = 1000;
		double bruto;
		if (tipoTrab == 'F') {
			if (ventas >= 5000) {
				bruto = fijo + ventas * 0.05;
			} else {
				bruto = fijo;
			}
		} else {
			if (ventas <= 3000) {
				bruto = ventas * 0.15;
			} else {
				if (ventas <= 5000) {
					// mostramos operaciones por claridad
					bruto = 3000 * 0.15 + (ventas - 3000) * 0.2;
				} else {
					bruto = 3000 * 0.15 + 2000 * 0.2 + (ventas - 5000) * 0.5;
				}
			}
		}
		return bruto;
	}

	public double calculaRet(char tipoTrab, double bruto) {
		double ret;
		if ((tipoTrab == 'E') || (bruto <= 1000)) {
			ret = bruto * 0.05;
		} else {
			if (bruto <= 1200) {
				ret = bruto * 0.15;
			} else {
				ret = bruto * 0.10;
			}
		}
		return ret;
	}

	public double calculaNeto(double bruto, double ret) {
		return bruto - ret;
	}
}
