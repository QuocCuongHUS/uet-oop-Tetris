package oop.h4t.tetris;// TPoint.java/* Cung cap toa do x, y cua tung hinh*/public class TPoint implements Comparable<TPoint>{	public int x;	public int y;	public int compareTo(TPoint other) {		if (other.x < x)			return -1;		if (other.x > x)			return 1;		if (other.y < y)			return -1;		if (other.y > y)			return 1;		return 0;	}	// Creates a TPoint based in int x,y	public TPoint(int x, int y) {		// questionable style but convenient --		// params with same name as ivars		this.x = x;		this.y = y;	}	// Creates a TPoint, copied from an existing TPoint	public TPoint(TPoint point) {		this.x = point.x;		this.y = point.y;	}	// Standard equals() override	public boolean equals(Object other) {		// standard two checks for equals()		if (this == other) return true;		if (!(other instanceof TPoint)) return false;		// check if other point same as us		TPoint pt = (TPoint)other;		return(x==pt.x && y==pt.y);	}	// Standard toString() override, produce	// human-readable String from object	public String toString() {		return "(" + x + "," + y + ")";	}}