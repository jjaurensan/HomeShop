package com.cursan.homeshop;

public interface Writer {
	/**
	 * Start writing process - Démarage du process d'écriture
	 */
	public void start();
	
	/**
	 * Write on line - Ecrire une ligne
	 * @param line
	 */
	public void writeline(String line);
	
	/**
	 *  Stop writing process - Stop le process d'ecriture
	 */
	public void stop();

}
