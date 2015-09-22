package ar.edu.unlam.tallerweb.cuentabancaria;

public class SaldoCuenta {

	private double saldoActual;

	public SaldoCuenta(double saldoActual) { // CONSTRUCTOR
		this.saldoActual = saldoActual;
	}

	public double consultarSaldoCuenta() {

		return this.saldoActual;
	}

	public void despositarSaldoCuenta(double montoDeposito) throws Exception {

		if (montoDeposito > 0) {
			this.saldoActual += montoDeposito;
		} else {
			throw new Exception("El monto debe ser mayor a 0.");
		}

	}

	public void extraerSaldoCuenta(double montoExtraccion)throws Exception {

		if ((this.saldoActual - montoExtraccion) >= 0 ) {
			this.saldoActual -= montoExtraccion ;
		} else {
			throw new Exception("El saldo actual no puede ser inferior a 0.");
		}
	}
}