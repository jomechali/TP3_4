package fr.diginamic.operations;

public class CalculMoyenne {
	
	private double[] storage = new double[2];
	private int storageSize = 0;
	
	public void addDouble(double toAdd) {
		
		if (storageSize >= storage.length) {
			double[] newStorage = new double[2 * storageSize];
			for (int i = 0; i < storage.length; i++) {
				newStorage[i] = storage[i];
			}
			storage = newStorage;
		}
		
		storage[storageSize] = toAdd;
		storageSize++;
	}

	public double ComputeMean() {
		
		double sum = 0.0;
		for (int i = 0; i < storageSize; i++) {
			sum += storage[i];
		}
		
		return sum/storageSize;
	}
}
