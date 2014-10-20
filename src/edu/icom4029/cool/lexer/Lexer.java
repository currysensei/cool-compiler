/* The following code was generated by JFlex 1.4.3 on 10/20/14 12:24 PM */


package edu.icom4029.cool.lexer;

import java_cup.runtime.*;
import java.io.IOException;

import edu.icom4029.cool.parser.TokenConstants;
import edu.icom4029.cool.core.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/20/14 12:24 PM from the specification file
 * <tt>/home/fabian/git/cool-compiler/src/Lexer.lex</tt>
 */
public final class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int MLCOMMENT = 4;
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\0\1\73"+
    "\5\0\1\60\1\12\1\11\1\65\1\67\1\10\1\70\1\66\12\6"+
    "\1\63\1\64\1\55\1\56\1\57\1\0\1\71\1\20\1\5\1\14"+
    "\1\46\1\24\1\26\1\5\1\34\1\30\2\5\1\16\1\5\1\32"+
    "\1\44\1\50\1\5\1\36\1\22\1\40\1\54\1\42\1\52\3\5"+
    "\1\0\1\74\2\0\1\7\1\0\1\17\1\4\1\13\1\45\1\23"+
    "\1\25\1\4\1\33\1\27\2\4\1\15\1\4\1\31\1\43\1\47"+
    "\1\4\1\35\1\21\1\37\1\53\1\41\1\51\3\4\1\61\1\0"+
    "\1\62\1\72\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\3\1\4\1\3\1\4\1\3\1\4\1\3"+
    "\1\4\1\3\1\4\1\3\1\4\1\3\1\4\1\3"+
    "\1\4\1\3\1\4\1\3\1\4\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\2\30\1\27\1\31\1\1"+
    "\3\2\1\32\1\33\2\3\2\4\2\3\2\4\2\3"+
    "\2\4\1\3\2\34\1\3\1\35\1\36\1\4\1\35"+
    "\1\36\2\3\2\4\2\3\1\4\2\37\1\3\1\4"+
    "\1\3\1\4\1\40\1\41\1\42\1\43\2\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\32\2\3\2\4"+
    "\1\53\1\3\1\53\1\4\2\3\2\4\3\3\2\4"+
    "\1\54\1\55\1\54\1\55\2\3\1\4\1\3\1\4"+
    "\1\3\1\4\1\3\1\56\1\4\1\56\2\57\1\60"+
    "\1\61\1\60\1\61\3\3\2\4\1\62\1\63\1\62"+
    "\2\64\1\3\1\4\2\65\1\66\2\3\2\4\2\67"+
    "\1\70\1\3\1\70\1\4\1\3\1\4\2\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\75\0\172\0\267\0\364\0\u0131\0\u016e\0\u01ab"+
    "\0\u01e8\0\u0225\0\267\0\u0262\0\u029f\0\u02dc\0\u0319\0\u0356"+
    "\0\u0393\0\u03d0\0\u040d\0\u044a\0\u0487\0\u04c4\0\u0501\0\u053e"+
    "\0\u057b\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac\0\u06e9\0\u0726"+
    "\0\u0763\0\u07a0\0\267\0\267\0\267\0\267\0\267\0\267"+
    "\0\267\0\267\0\267\0\267\0\267\0\u07dd\0\364\0\u081a"+
    "\0\u0857\0\267\0\u0894\0\267\0\u08d1\0\u090e\0\u094b\0\267"+
    "\0\u0988\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c\0\u0ab9\0\u0af6\0\u0b33"+
    "\0\u0b70\0\u0bad\0\u0bea\0\u0c27\0\u0c64\0\u0131\0\u016e\0\u0ca1"+
    "\0\u0131\0\u0cde\0\u0d1b\0\u016e\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f"+
    "\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\u0131\0\u016e\0\u0f40\0\u0f7d"+
    "\0\u0fba\0\u0ff7\0\267\0\267\0\267\0\267\0\u1034\0\267"+
    "\0\267\0\267\0\267\0\267\0\267\0\267\0\267\0\u1071"+
    "\0\u10ae\0\u10eb\0\u1128\0\u0131\0\u1165\0\u016e\0\u11a2\0\u11df"+
    "\0\u121c\0\u1259\0\u1296\0\u12d3\0\u1310\0\u134d\0\u138a\0\u13c7"+
    "\0\u0131\0\u0131\0\u016e\0\u016e\0\u1404\0\u1441\0\u147e\0\u14bb"+
    "\0\u14f8\0\u1535\0\u1572\0\u15af\0\u0131\0\u15ec\0\u016e\0\u0131"+
    "\0\u016e\0\u0131\0\u0131\0\u016e\0\u016e\0\u1629\0\u1666\0\u16a3"+
    "\0\u16e0\0\u171d\0\u0131\0\u0131\0\u016e\0\u0131\0\u016e\0\u175a"+
    "\0\u1797\0\u0131\0\u016e\0\u0131\0\u17d4\0\u1811\0\u184e\0\u188b"+
    "\0\u0131\0\u016e\0\u0131\0\u18c8\0\u016e\0\u1905\0\u1942\0\u197f"+
    "\0\u0131\0\u016e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\3\5\1\6\1\7\1\10\1\4\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\6\1\7\1\6"+
    "\1\7\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\6\1\7\1\6\1\7\1\30\1\31\1\6"+
    "\1\7\1\32\1\33\1\6\1\7\1\34\1\35\1\36"+
    "\1\37\1\6\1\7\1\40\1\41\1\4\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\4\1\56\1\57\1\60\1\61\67\56"+
    "\1\62\1\63\1\64\3\5\5\64\1\65\46\64\1\66"+
    "\14\64\76\0\3\5\75\0\4\6\3\0\42\6\24\0"+
    "\4\7\3\0\42\7\26\0\1\10\76\0\1\67\76\0"+
    "\1\70\66\0\4\6\3\0\2\6\2\71\2\72\34\6"+
    "\24\0\4\7\3\0\2\7\2\73\2\74\34\7\24\0"+
    "\4\6\3\0\10\6\2\75\16\6\2\76\10\6\24\0"+
    "\4\7\3\0\10\7\2\77\16\7\2\100\10\7\24\0"+
    "\4\6\3\0\2\6\2\101\2\6\2\102\32\6\24\0"+
    "\4\7\3\0\2\7\2\103\2\7\2\104\32\7\24\0"+
    "\4\6\3\0\4\6\2\105\6\6\2\106\24\6\24\0"+
    "\4\7\3\0\14\7\2\107\24\7\24\0\4\6\3\0"+
    "\6\6\2\110\2\6\2\111\2\6\2\112\22\6\24\0"+
    "\4\7\3\0\6\7\2\113\2\7\2\114\2\7\2\115"+
    "\22\7\24\0\4\6\3\0\10\6\2\116\16\6\2\117"+
    "\10\6\24\0\4\7\3\0\10\7\2\120\16\7\2\121"+
    "\10\7\24\0\4\6\3\0\20\6\2\122\2\123\16\6"+
    "\24\0\4\7\3\0\20\7\2\124\20\7\24\0\4\6"+
    "\3\0\12\6\2\125\26\6\24\0\4\7\3\0\12\7"+
    "\2\126\26\7\24\0\4\6\3\0\30\6\2\127\10\6"+
    "\24\0\4\7\3\0\30\7\2\130\10\7\24\0\4\6"+
    "\3\0\20\6\2\131\20\6\24\0\4\7\3\0\20\7"+
    "\2\132\20\7\30\0\1\133\45\0\1\134\75\0\1\135"+
    "\26\0\1\136\63\0\1\56\2\0\70\56\3\0\1\57"+
    "\2\5\71\0\1\56\2\5\1\61\67\56\3\0\2\137"+
    "\26\0\1\140\3\0\1\141\1\0\1\142\33\0\1\143"+
    "\1\144\12\0\1\145\73\0\1\146\63\0\1\67\1\147"+
    "\73\67\4\0\4\6\3\0\4\6\2\150\34\6\24\0"+
    "\4\6\3\0\6\6\2\151\32\6\24\0\4\7\3\0"+
    "\4\7\2\152\34\7\24\0\4\7\3\0\6\7\2\153"+
    "\32\7\24\0\4\6\3\0\24\6\2\154\14\6\24\0"+
    "\4\6\3\0\30\6\2\155\10\6\24\0\4\7\3\0"+
    "\24\7\2\156\14\7\24\0\4\7\3\0\30\7\2\157"+
    "\10\7\24\0\4\6\3\0\6\6\2\160\32\6\24\0"+
    "\4\6\3\0\4\6\2\161\34\6\24\0\4\7\3\0"+
    "\6\7\2\162\32\7\24\0\4\7\3\0\4\7\2\163"+
    "\34\7\24\0\4\6\3\0\2\6\2\164\36\6\24\0"+
    "\4\6\3\0\26\6\2\165\12\6\24\0\4\6\3\0"+
    "\20\6\2\166\20\6\24\0\4\7\3\0\26\7\2\167"+
    "\12\7\24\0\4\7\3\0\20\7\2\170\20\7\24\0"+
    "\4\6\3\0\36\6\2\171\2\6\24\0\4\6\3\0"+
    "\24\6\2\172\14\6\24\0\4\7\3\0\36\7\2\173"+
    "\2\7\24\0\4\7\3\0\24\7\2\174\14\7\24\0"+
    "\4\6\3\0\10\6\2\175\30\6\24\0\4\6\3\0"+
    "\40\6\2\176\24\0\4\7\3\0\10\7\2\177\30\7"+
    "\24\0\4\6\3\0\30\6\2\200\10\6\24\0\4\7"+
    "\3\0\30\7\2\201\10\7\24\0\4\6\3\0\14\6"+
    "\2\202\24\6\24\0\4\7\3\0\14\7\2\203\24\7"+
    "\21\0\3\137\75\0\4\6\3\0\6\6\2\204\32\6"+
    "\24\0\4\6\3\0\10\6\2\205\30\6\24\0\4\7"+
    "\3\0\6\7\2\206\32\7\24\0\4\7\3\0\10\7"+
    "\2\207\30\7\24\0\4\6\3\0\34\6\2\210\4\6"+
    "\24\0\4\7\3\0\34\7\2\211\4\7\24\0\4\6"+
    "\3\0\10\6\2\212\30\6\24\0\4\6\3\0\2\213"+
    "\40\6\24\0\4\7\3\0\10\7\2\214\30\7\24\0"+
    "\4\7\3\0\2\215\40\7\24\0\4\6\3\0\6\6"+
    "\2\216\32\6\24\0\4\6\3\0\30\6\2\217\10\6"+
    "\24\0\4\6\3\0\10\6\2\220\30\6\24\0\4\7"+
    "\3\0\30\7\2\221\10\7\24\0\4\7\3\0\10\7"+
    "\2\222\30\7\24\0\4\6\3\0\16\6\2\223\22\6"+
    "\24\0\4\6\3\0\10\6\2\224\30\6\24\0\4\7"+
    "\3\0\16\7\2\225\22\7\24\0\4\6\3\0\2\6"+
    "\2\226\36\6\24\0\4\7\3\0\2\7\2\227\36\7"+
    "\24\0\4\6\3\0\2\6\2\230\36\6\24\0\4\7"+
    "\3\0\2\7\2\231\36\7\24\0\4\6\3\0\6\6"+
    "\2\232\32\6\24\0\4\7\3\0\6\7\2\233\32\7"+
    "\24\0\4\6\3\0\10\6\2\234\30\6\24\0\4\6"+
    "\3\0\14\6\2\235\24\6\24\0\4\6\3\0\22\6"+
    "\2\236\16\6\24\0\4\7\3\0\14\7\2\237\24\7"+
    "\24\0\4\7\3\0\22\7\2\240\16\7\24\0\4\6"+
    "\3\0\10\6\2\241\30\6\24\0\4\7\3\0\10\7"+
    "\2\242\30\7\24\0\4\6\3\0\32\6\2\243\6\6"+
    "\24\0\4\6\3\0\14\6\2\244\24\6\24\0\4\7"+
    "\3\0\32\7\2\245\6\7\24\0\4\7\3\0\14\7"+
    "\2\246\24\7\24\0\4\6\3\0\24\6\2\247\14\6"+
    "\24\0\4\7\3\0\24\7\2\250\14\7\24\0\4\6"+
    "\3\0\6\6\2\251\32\6\24\0\4\7\3\0\6\7"+
    "\2\252\32\7\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6588];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\6\1\1\11\27\1\13\11\4\1\1\11"+
    "\1\1\1\11\3\1\1\11\42\1\4\11\1\1\10\11"+
    "\103\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	int commentLevel = 0;
	AbstractSymbol filename = AbstractTable.stringtable.addString("");
	StringBuffer string = new StringBuffer();
	
	private Symbol sym(int type) {
		return sym(type, yytext());
	}

	private Symbol sym(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}

	private void error() throws IOException {
		throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
	}
	
	public int getLineNumber() {
		return yyline + 1;
	}
	
	public AbstractSymbol getFilename() {
		return filename;
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
  	// TODO: code that goes to constructor
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 9: 
          { return sym(TokenConstants.LT);
          }
        case 58: break;
        case 45: 
          { return sym(TokenConstants.NOT);
          }
        case 59: break;
        case 8: 
          { return sym(TokenConstants.RPAREN);
          }
        case 60: break;
        case 3: 
          { AbstractSymbol lexValue = AbstractTable.idtable.addString(yytext());
						  return sym(TokenConstants.OBJECTID, lexValue);
          }
        case 61: break;
        case 17: 
          { return sym(TokenConstants.DIV);
          }
        case 62: break;
        case 4: 
          { AbstractSymbol lexValue = AbstractTable.idtable.addString(yytext());
						  return sym(TokenConstants.TYPEID, lexValue);
          }
        case 63: break;
        case 18: 
          { return sym(TokenConstants.COMMA);
          }
        case 64: break;
        case 38: 
          { string.append('\t');
          }
        case 65: break;
        case 12: 
          { return sym(TokenConstants.LBRACE);
          }
        case 66: break;
        case 15: 
          { return sym(TokenConstants.SEMI);
          }
        case 67: break;
        case 42: 
          { commentLevel++;
          }
        case 68: break;
        case 27: 
          { return sym(TokenConstants.ERROR, "Unmatched comment terminator");
          }
        case 69: break;
        case 1: 
          { return sym(TokenConstants.ERROR);
          }
        case 70: break;
        case 22: 
          { string.setLength(0); yybegin(STRING);
          }
        case 71: break;
        case 41: 
          { commentLevel--; if (commentLevel <= 0) yybegin(YYINITIAL); /* Ignore */
          }
        case 72: break;
        case 35: 
          { commentLevel++; yybegin(MLCOMMENT);
          }
        case 73: break;
        case 53: 
          { return sym(TokenConstants.CLASS);
          }
        case 74: break;
        case 32: 
          { return sym(TokenConstants.ASSIGN);
          }
        case 75: break;
        case 40: 
          { string.append('\\');
          }
        case 76: break;
        case 5: 
          { AbstractSymbol lexValue = AbstractTable.inttable.addString(yytext());
						  return sym(TokenConstants.INT_CONST, lexValue);
          }
        case 77: break;
        case 52: 
          { return sym(TokenConstants.POOL);
          }
        case 78: break;
        case 37: 
          { string.append('\r');
          }
        case 79: break;
        case 26: 
          { /* Ignore */
          }
        case 80: break;
        case 29: 
          { return sym(TokenConstants.IF);
          }
        case 81: break;
        case 21: 
          { return sym(TokenConstants.NEG);
          }
        case 82: break;
        case 54: 
          { return sym(TokenConstants.BOOL_CONST, false);
          }
        case 83: break;
        case 43: 
          { return sym(TokenConstants.LET);
          }
        case 84: break;
        case 30: 
          { return sym(TokenConstants.IN);
          }
        case 85: break;
        case 10: 
          { return sym(TokenConstants.EQ);
          }
        case 86: break;
        case 39: 
          { string.append('\"');
          }
        case 87: break;
        case 20: 
          { return sym(TokenConstants.AT);
          }
        case 88: break;
        case 24: 
          { yybegin(YYINITIAL); return sym(TokenConstants.ERROR, "Unescaped newline in string");
          }
        case 89: break;
        case 57: 
          { return sym(TokenConstants.INHERITS);
          }
        case 90: break;
        case 11: 
          { return sym(TokenConstants.LPAREN);
          }
        case 91: break;
        case 44: 
          { return sym(TokenConstants.NEW);
          }
        case 92: break;
        case 51: 
          { return sym(TokenConstants.BOOL_CONST, true);
          }
        case 93: break;
        case 25: 
          { yybegin(YYINITIAL);
										AbstractSymbol lexValue = AbstractTable.stringtable.addString(string.toString());
										return sym(TokenConstants.STR_CONST, lexValue);
          }
        case 94: break;
        case 13: 
          { return sym(TokenConstants.RBRACE);
          }
        case 95: break;
        case 2: 
          { /* Ignore. */
          }
        case 96: break;
        case 36: 
          { string.append('\n');
          }
        case 97: break;
        case 34: 
          { return sym(TokenConstants.DARROW);
          }
        case 98: break;
        case 23: 
          { string.append(yytext());
          }
        case 99: break;
        case 14: 
          { return sym(TokenConstants.COLON);
          }
        case 100: break;
        case 33: 
          { return sym(TokenConstants.LE);
          }
        case 101: break;
        case 19: 
          { return sym(TokenConstants.DOT);
          }
        case 102: break;
        case 56: 
          { return sym(TokenConstants.ISVOID);
          }
        case 103: break;
        case 47: 
          { return sym(TokenConstants.LOOP);
          }
        case 104: break;
        case 16: 
          { return sym(TokenConstants.PLUS);
          }
        case 105: break;
        case 55: 
          { return sym(TokenConstants.WHILE);
          }
        case 106: break;
        case 28: 
          { return sym(TokenConstants.FI);
          }
        case 107: break;
        case 49: 
          { return sym(TokenConstants.ESAC);
          }
        case 108: break;
        case 31: 
          { return sym(TokenConstants.OF);
          }
        case 109: break;
        case 46: 
          { return sym(TokenConstants.CASE);
          }
        case 110: break;
        case 48: 
          { return sym(TokenConstants.ELSE);
          }
        case 111: break;
        case 7: 
          { return sym(TokenConstants.MULT);
          }
        case 112: break;
        case 50: 
          { return sym(TokenConstants.THEN);
          }
        case 113: break;
        case 6: 
          { return sym(TokenConstants.MINUS);
          }
        case 114: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case MLCOMMENT: {
              yybegin(YYINITIAL); return sym(TokenConstants.ERROR, "EOF in comment.");
            }
            case 171: break;
            case STRING: {
              yybegin(YYINITIAL); return sym(TokenConstants.ERROR, "EOF in string");
            }
            case 172: break;
            default:
              {
                return sym(TokenConstants.EOF);
              }
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
