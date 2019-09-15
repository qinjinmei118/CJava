package bits.org.MatrixDemo;

import javax.management.RuntimeErrorException;

public abstract class GenericMatrix<E extends Number> {
	protected abstract E add(E element1,E element);
	protected abstract E multiply(E element1,E element);
	protected abstract E zero();
	public abstract void print(E aa[][]);
	public abstract E[][] addMatrix(E matrix1[][],E matrix2[][]);
	public abstract E[][] mutiplyMatrix(E matrix1[][],E matrix2[][]);
}
