package de.denn.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.GsonBuilder;

import de.denn.graph.tours.DENNTour;

public class TourFileWriter {

	private DENNTour dt;

	public TourFileWriter(DENNTour dt) {
		this.dt = dt;
	}

	public void save(File f) {
		try {
			f.createNewFile();

			FileWriter myWriter = new FileWriter(f);
			myWriter.write(new GsonBuilder().setPrettyPrinting().create().toJson(dt));
			myWriter.close();
		} catch (IOException e) {
		}
	}

}
