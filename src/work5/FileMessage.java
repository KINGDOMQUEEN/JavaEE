package work5;

public class FileMessage {
    private String fileName;
    private String size;
    private String rows;
    private String words;
    private String shuzi;
    private String zimu;
    public void set(String fileName,String size,String rows,String words,String shuzi,String zimu){
    	this.fileName=fileName;
    	this.size=size;
    	this.rows=rows;
    	this.words=words;
    	this.shuzi=shuzi;
    	this.zimu=zimu;
    }
	public String getShuzi() {
		return shuzi;
	}
	public void setShuzi(String shuzi) {
		this.shuzi = shuzi;
	}
	public String getZimu() {
		return zimu;
	}
	public void setZimu(String zimu) {
		this.zimu = zimu;
	}
	public FileMessage() {
		// TODO Auto-generated constructor stub
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}

}
