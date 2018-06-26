package pusty.f0cr.attribute;

import java.io.DataInputStream;

import pusty.f0cr.ClassReader;
import pusty.f0cr.data.LineInfo;

public class LineNumberTableAttribute extends Attribute {
	
	protected short line_number_table_length;
	protected LineInfo[] lineNumberTable;
	public LineNumberTableAttribute(ClassReader classReader, DataInputStream s, int l) throws Exception {
		super(classReader, s, l);
	}

	@Override
	public void read(DataInputStream s) throws Exception {
		line_number_table_length = s.readShort();
		lineNumberTable = new LineInfo[line_number_table_length];
		for(int i=0;i<line_number_table_length;i++)
			lineNumberTable[i] = new LineInfo(classReader, s);
	}
	
	public short getSize() { return line_number_table_length; }
	public LineInfo[] getTable() { return lineNumberTable; }
	@Override
	public void printOut(String pre) {
		for(int li=0;li<getSize();li++) {
			LineInfo l = getTable()[li];
			System.out.println(pre+l.getLineNumber()+" => "+l.getStart());
		}
	}
	/**
	 * Returns source code line for given instruction offset
	 * @param code offset in code
	 * @return source code line
	 */
	public int getSourceLine(int code) {
		for(int li=0;li<getSize();li++) {
			LineInfo l = getTable()[li];
			if(l.getStart() == code) return l.getLineNumber();
		} return -1;
	}
	/**
	 * Returns instruction offset for source code line 'line'
	 * @param line source code line
	 * @return instruction offset
	 */
	public int getOffset(int line) {
		for(int li=0;li<getSize();li++) {
			LineInfo l = getTable()[li];
			if(l.getLineNumber() == line) return l.getStart();
		} return -1;
	}
}
