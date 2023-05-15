package com.uta.daa;

public class SortClass {

	public String name;
	public String sortime;
	public String sortarray;

	public SortClass(String name, String sortime, String sortarray) {
		super();
		this.name = name;
		this.sortime = sortime;
		this.sortarray = sortarray;
		}

		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public String getSortime() {
		return sortime;
		}
		public void setSortime(String sortime) {
		this.sortime = sortime;
		}
		public String getSortarray() {
		return sortarray;
		}
		public void setSortarray(String sortarray) {
		this.sortarray = sortarray;
		}

}
