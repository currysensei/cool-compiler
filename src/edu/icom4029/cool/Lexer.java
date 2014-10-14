/* The following code was generated by JFlex 1.4.3 on 10/14/14 11:58 AM */


package edu.icom4029.cool;

import java_cup.runtime.*;
import java.io.IOException;

// import .LexerSym;
// import static .LexerSym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/14/14 11:58 AM from the specification file
 * <tt>/home/parallels/Desktop/icom4029-workspace/cool-compiler/Lexer.lex</tt>
 */
public final class Lexer {

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
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\0\1\50"+
    "\5\0\1\37\1\13\1\12\1\44\1\46\1\11\1\47\1\45\12\7"+
    "\1\42\1\43\1\34\1\35\1\36\2\0\32\6\1\0\1\51\2\0"+
    "\1\10\1\0\1\16\1\5\1\14\1\30\1\20\1\21\1\5\1\24"+
    "\1\22\2\5\1\15\1\5\1\23\1\27\1\31\1\5\1\25\1\17"+
    "\1\26\1\33\1\4\1\32\3\5\1\40\1\0\1\41\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\12\3\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\2\26"+
    "\1\25\1\27\1\30\2\2\1\31\1\32\7\3\1\33"+
    "\1\3\1\34\1\35\4\3\1\36\2\3\1\37\1\40"+
    "\1\41\1\42\2\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\31\2\3\1\51\6\3\1\52\1\53\5\3\1\54"+
    "\1\55\1\56\1\57\2\3\1\60\1\61\1\62\1\3"+
    "\1\63\2\3\1\64\1\65\2\3\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[108];
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
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\176\0\u01ce\0\u01f8\0\u0222\0\u024c"+
    "\0\u0276\0\u02a0\0\u02ca\0\u02f4\0\u031e\0\u0348\0\u0372\0\u039c"+
    "\0\u03c6\0\176\0\176\0\176\0\176\0\176\0\176\0\176"+
    "\0\176\0\176\0\u03f0\0\u041a\0\250\0\u0444\0\176\0\u046e"+
    "\0\176\0\u0498\0\u04c2\0\176\0\u04ec\0\u0516\0\u0540\0\u056a"+
    "\0\u0594\0\u05be\0\u05e8\0\374\0\u0612\0\374\0\u063c\0\u0666"+
    "\0\u0690\0\u06ba\0\u06e4\0\374\0\u070e\0\u0738\0\176\0\176"+
    "\0\176\0\176\0\u0762\0\176\0\176\0\176\0\176\0\176"+
    "\0\176\0\176\0\u078c\0\u07b6\0\374\0\u07e0\0\u080a\0\u0834"+
    "\0\u085e\0\u0888\0\u08b2\0\374\0\374\0\u08dc\0\u0906\0\u0930"+
    "\0\u095a\0\u0984\0\374\0\374\0\374\0\374\0\u09ae\0\u09d8"+
    "\0\374\0\374\0\374\0\u0a02\0\374\0\u0a2c\0\u0a56\0\374"+
    "\0\374\0\u0a80\0\u0aaa\0\374";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[108];
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
    "\1\4\3\5\1\6\1\7\1\10\1\11\1\4\1\12"+
    "\1\13\1\14\1\15\1\16\2\7\1\17\1\20\1\21"+
    "\1\22\2\7\1\23\1\24\1\7\1\25\1\26\1\7"+
    "\1\27\1\30\1\4\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\4\1\43\1\44"+
    "\1\45\2\46\43\43\1\47\1\50\1\51\4\5\5\51"+
    "\1\52\37\51\53\0\4\5\46\0\3\5\1\6\4\7"+
    "\3\0\20\7\22\0\5\7\3\0\20\7\22\0\5\10"+
    "\3\0\20\10\25\0\1\11\53\0\1\53\53\0\1\54"+
    "\42\0\5\7\3\0\1\7\1\55\1\56\15\7\22\0"+
    "\5\7\3\0\4\7\1\57\6\7\1\60\4\7\22\0"+
    "\5\7\3\0\1\7\1\61\1\7\1\62\14\7\22\0"+
    "\5\7\3\0\2\7\1\63\3\7\1\64\11\7\22\0"+
    "\5\7\3\0\3\7\1\65\1\7\1\66\1\7\1\67"+
    "\10\7\22\0\5\7\3\0\4\7\1\70\6\7\1\71"+
    "\4\7\22\0\5\7\3\0\10\7\1\72\1\73\6\7"+
    "\22\0\5\7\3\0\5\7\1\74\12\7\22\0\5\7"+
    "\3\0\13\7\1\75\4\7\22\0\5\7\3\0\10\7"+
    "\1\76\7\7\27\0\1\77\23\0\1\100\52\0\1\101"+
    "\25\0\1\102\37\0\1\43\2\0\45\43\3\0\1\5"+
    "\1\45\2\5\45\0\1\43\2\5\2\46\43\43\3\0"+
    "\1\103\1\104\20\0\1\105\1\0\1\106\1\107\21\0"+
    "\1\110\14\0\1\111\36\0\2\53\1\112\47\53\4\0"+
    "\5\7\3\0\2\7\1\113\15\7\22\0\5\7\3\0"+
    "\3\7\1\114\14\7\22\0\5\7\3\0\12\7\1\115"+
    "\5\7\22\0\5\7\3\0\13\7\1\116\4\7\22\0"+
    "\5\7\3\0\3\7\1\117\14\7\22\0\5\7\3\0"+
    "\2\7\1\120\15\7\22\0\5\7\3\0\1\7\1\121"+
    "\16\7\22\0\1\122\4\7\3\0\20\7\22\0\5\7"+
    "\3\0\10\7\1\123\7\7\22\0\5\7\3\0\16\7"+
    "\1\124\1\7\22\0\5\7\3\0\12\7\1\125\5\7"+
    "\22\0\5\7\3\0\4\7\1\126\13\7\22\0\5\7"+
    "\3\0\17\7\1\127\22\0\5\7\3\0\13\7\1\130"+
    "\4\7\22\0\5\7\3\0\6\7\1\131\11\7\20\0"+
    "\1\104\53\0\5\7\3\0\3\7\1\132\14\7\22\0"+
    "\5\7\3\0\4\7\1\133\13\7\22\0\5\7\3\0"+
    "\15\7\1\134\2\7\22\0\5\7\3\0\4\7\1\135"+
    "\13\7\22\0\5\7\3\0\1\136\17\7\22\0\5\7"+
    "\3\0\3\7\1\127\14\7\22\0\5\7\3\0\13\7"+
    "\1\137\4\7\22\0\5\7\3\0\4\7\1\140\13\7"+
    "\22\0\5\7\3\0\7\7\1\141\10\7\22\0\5\7"+
    "\3\0\4\7\1\142\13\7\22\0\5\7\3\0\1\7"+
    "\1\143\16\7\22\0\5\7\3\0\1\7\1\144\16\7"+
    "\22\0\5\7\3\0\3\7\1\145\14\7\22\0\5\7"+
    "\3\0\6\7\1\146\11\7\22\0\5\7\3\0\11\7"+
    "\1\147\6\7\22\0\5\7\3\0\4\7\1\150\13\7"+
    "\22\0\5\7\3\0\14\7\1\151\3\7\22\0\5\7"+
    "\3\0\6\7\1\152\11\7\22\0\5\7\3\0\12\7"+
    "\1\153\5\7\22\0\5\7\3\0\3\7\1\154\14\7"+
    "\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2772];
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
    "\3\0\1\11\7\1\1\11\15\1\11\11\4\1\1\11"+
    "\1\1\1\11\2\1\1\11\22\1\4\11\1\1\7\11"+
    "\42\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[108];
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
	StringBuffer string = new StringBuffer();
	
	private Symbol sym(int type)
	{
		return sym(type, yytext());
	}

	private Symbol sym(int type, Object value)
	{
		return new Symbol(type, yyline, yycolumn, value);
	}

	private void error()
	throws IOException
	{
		throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
	}
	
	public int getLineNumber() {
		return yyline + 1;
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
    while (i < 118) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol nextToken() throws java.io.IOException {
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
        case 55: break;
        case 43: 
          { return sym(TokenConstants.NOT);
          }
        case 56: break;
        case 8: 
          { return sym(TokenConstants.RPAREN);
          }
        case 57: break;
        case 49: 
          { return sym(TokenConstants.BOOL_CONST);
          }
        case 58: break;
        case 17: 
          { return sym(TokenConstants.DIV);
          }
        case 59: break;
        case 18: 
          { return sym(TokenConstants.COMMA);
          }
        case 60: break;
        case 38: 
          { string.append('\t');
          }
        case 61: break;
        case 12: 
          { return sym(TokenConstants.LBRACE);
          }
        case 62: break;
        case 15: 
          { return sym(TokenConstants.SEMI);
          }
        case 63: break;
        case 26: 
          { return sym(TokenConstants.ERROR, "Unmatched comment terminator");
          }
        case 64: break;
        case 1: 
          { return sym(TokenConstants.ERROR);
          }
        case 65: break;
        case 20: 
          { string.setLength(0); yybegin(STRING);
          }
        case 66: break;
        case 51: 
          { return sym(TokenConstants.CLASS);
          }
        case 67: break;
        case 31: 
          { return sym(TokenConstants.ASSIGN);
          }
        case 68: break;
        case 24: 
          { string.append('\\');
          }
        case 69: break;
        case 50: 
          { return sym(TokenConstants.POOL);
          }
        case 70: break;
        case 37: 
          { string.append('\r');
          }
        case 71: break;
        case 3: 
          { AbstractSymbol lexValue = AbstractTable.idtable.addString(yytext());
							return sym(TokenConstants.OBJECTID, lexValue);
          }
        case 72: break;
        case 35: 
          { /* Do nothing. Continue. */
          }
        case 73: break;
        case 25: 
          { /* Ignore */
          }
        case 74: break;
        case 28: 
          { return sym(TokenConstants.IF);
          }
        case 75: break;
        case 41: 
          { return sym(TokenConstants.LET);
          }
        case 76: break;
        case 29: 
          { return sym(TokenConstants.IN);
          }
        case 77: break;
        case 40: 
          { yybegin(YYINITIAL); /* Ignore. */
          }
        case 78: break;
        case 10: 
          { return sym(TokenConstants.EQ);
          }
        case 79: break;
        case 39: 
          { string.append('\"');
          }
        case 80: break;
        case 22: 
          { yybegin(YYINITIAL); return sym(TokenConstants.ERROR, "Unescaped newline in string");
          }
        case 81: break;
        case 54: 
          { return sym(TokenConstants.INHERITS);
          }
        case 82: break;
        case 5: 
          { AbstractSymbol lexValue = AbstractTable.inttable.addString(yytext());
							return sym(TokenConstants.INT_CONST, lexValue);
          }
        case 83: break;
        case 11: 
          { return sym(TokenConstants.LPAREN);
          }
        case 84: break;
        case 42: 
          { return sym(TokenConstants.NEW);
          }
        case 85: break;
        case 13: 
          { return sym(TokenConstants.RBRACE);
          }
        case 86: break;
        case 2: 
          { /* Ignore. */
          }
        case 87: break;
        case 4: 
          { AbstractSymbol lexValue = AbstractTable.idtable.addString(yytext());
							return sym(TokenConstants.TYPEID, lexValue);
          }
        case 88: break;
        case 36: 
          { string.append('\n');
          }
        case 89: break;
        case 33: 
          { return sym(TokenConstants.DARROW);
          }
        case 90: break;
        case 21: 
          { string.append(yytext());
          }
        case 91: break;
        case 14: 
          { return sym(TokenConstants.COLON);
          }
        case 92: break;
        case 32: 
          { return sym(TokenConstants.LE);
          }
        case 93: break;
        case 19: 
          { return sym(TokenConstants.DOT);
          }
        case 94: break;
        case 53: 
          { return sym(TokenConstants.ISVOID);
          }
        case 95: break;
        case 45: 
          { return sym(TokenConstants.LOOP);
          }
        case 96: break;
        case 16: 
          { return sym(TokenConstants.PLUS);
          }
        case 97: break;
        case 52: 
          { return sym(TokenConstants.WHILE);
          }
        case 98: break;
        case 27: 
          { return sym(TokenConstants.FI);
          }
        case 99: break;
        case 47: 
          { return sym(TokenConstants.ESAC);
          }
        case 100: break;
        case 34: 
          { yybegin(MLCOMMENT);
          }
        case 101: break;
        case 30: 
          { return sym(TokenConstants.OF);
          }
        case 102: break;
        case 44: 
          { return sym(TokenConstants.CASE);
          }
        case 103: break;
        case 46: 
          { return sym(TokenConstants.ELSE);
          }
        case 104: break;
        case 23: 
          { yybegin(YYINITIAL);
							AbstractSymbol lexValue = AbstractTable.stringtable.addString(string.toString());
							return sym(TokenConstants.STR_CONST, lexValue);
          }
        case 105: break;
        case 7: 
          { return sym(TokenConstants.MULT);
          }
        case 106: break;
        case 48: 
          { return sym(TokenConstants.THEN);
          }
        case 107: break;
        case 6: 
          { return sym(TokenConstants.MINUS);
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case MLCOMMENT: {
              yybegin(YYINITIAL); return sym(TokenConstants.ERROR, "EOF in comment.");
            }
            case 109: break;
            case STRING: {
              yybegin(YYINITIAL); return sym(TokenConstants.ERROR, "EOF in string");
            }
            case 110: break;
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
