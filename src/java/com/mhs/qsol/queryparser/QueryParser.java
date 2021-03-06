/* Generated By:JavaCC: Do not edit this line. QueryParser.java */
package com.mhs.qsol.queryparser;

import java.util.Map;
import com.mhs.qsol.QsolParser.Operator;
import com.mhs.qsol.syntaxtree.*;
import java.util.Vector;

public class QueryParser implements QueryParserConstants {
  public void setOrderOfOps(Map opMap) {
    token_source.orderOfOps = opMap;
  }

  public void setHideOps(boolean hideOr, boolean hideAnd, boolean hideAndNot,
      boolean hideProximity) {
    token_source.hideAnd = hideAnd;
    token_source.hideOr = hideOr;
    token_source.hideAndNot = hideAndNot;
    token_source.hideProximity = hideProximity;
  }

  final public Search Search() throws ParseException {
    CheckOrd1Search n0;
    NodeToken n1;
    Token n2;
    n0 = CheckOrd1Search();
    n2 = jj_consume_token(0);
    n2.beginColumn++;
    n2.endColumn++;
    n1 = JTBToolkit.makeNodeToken(n2);
    {
      if (true)
        return new Search(n0, n1);
    }
    throw new Error("Missing return statement in function");
  }

  final public CheckOrd1Search CheckOrd1Search() throws ParseException {
    CheckOrd2Search n0;
    NodeOptional n1 = new NodeOptional();
    Ord1Search n2;
    n0 = CheckOrd2Search();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP1:
      n2 = Ord1Search();
      n1.addNode(n2);
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    {
      if (true)
        return new CheckOrd1Search(n0, n1);
    }
    throw new Error("Missing return statement in function");
  }

  final public Ord1Search Ord1Search() throws ParseException {
    NodeToken n0;
    Token n1;
    CheckOrd2Search n2;
    NodeOptional n3 = new NodeOptional();
    Ord1Search n4;
    n1 = jj_consume_token(OP1);
    n0 = JTBToolkit.makeNodeToken(n1);
    n2 = CheckOrd2Search();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP1:
      n4 = Ord1Search();
      n3.addNode(n4);
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    {
      if (true)
        return new Ord1Search(n0, n2, n3);
    }
    throw new Error("Missing return statement in function");
  }

  final public CheckOrd2Search CheckOrd2Search() throws ParseException {
    CheckOrd3Search n0;
    NodeOptional n1 = new NodeOptional();
    Ord2Search n2;
    n0 = CheckOrd3Search();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP2:
      n2 = Ord2Search();
      n1.addNode(n2);
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    {
      if (true)
        return new CheckOrd2Search(n0, n1);
    }
    throw new Error("Missing return statement in function");
  }

  final public Ord2Search Ord2Search() throws ParseException {
    NodeToken n0;
    Token n1;
    CheckOrd3Search n2;
    NodeOptional n3 = new NodeOptional();
    Ord2Search n4;
    n1 = jj_consume_token(OP2);
    n0 = JTBToolkit.makeNodeToken(n1);
    n2 = CheckOrd3Search();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP2:
      n4 = Ord2Search();
      n3.addNode(n4);
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    {
      if (true)
        return new Ord2Search(n0, n2, n3);
    }
    throw new Error("Missing return statement in function");
  }

  final public CheckOrd3Search CheckOrd3Search() throws ParseException {
    CheckOrd4Search n0;
    NodeOptional n1 = new NodeOptional();
    Ord3Search n2;
    n0 = CheckOrd4Search();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP3:
      n2 = Ord3Search();
      n1.addNode(n2);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    {
      if (true)
        return new CheckOrd3Search(n0, n1);
    }
    throw new Error("Missing return statement in function");
  }

  final public Ord3Search Ord3Search() throws ParseException {
    NodeToken n0;
    Token n1;
    CheckOrd4Search n2;
    NodeOptional n3 = new NodeOptional();
    Ord3Search n4;
    n1 = jj_consume_token(OP3);
    n0 = JTBToolkit.makeNodeToken(n1);
    n2 = CheckOrd4Search();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP3:
      n4 = Ord3Search();
      n3.addNode(n4);
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    {
      if (true)
        return new Ord3Search(n0, n2, n3);
    }
    throw new Error("Missing return statement in function");
  }

  final public CheckOrd4Search CheckOrd4Search() throws ParseException {
    BasicSearch n0;
    NodeOptional n1 = new NodeOptional();
    Ord4Search n2;
    n0 = BasicSearch();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP4:
      n2 = Ord4Search();
      n1.addNode(n2);
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    {
      if (true)
        return new CheckOrd4Search(n0, n1);
    }
    throw new Error("Missing return statement in function");
  }

  final public Ord4Search Ord4Search() throws ParseException {
    NodeToken n0;
    Token n1;
    BasicSearch n2;
    NodeOptional n3 = new NodeOptional();
    Ord4Search n4;
    n1 = jj_consume_token(OP4);
    n0 = JTBToolkit.makeNodeToken(n1);
    n2 = BasicSearch();
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case OP4:
      n4 = Ord4Search();
      n3.addNode(n4);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    {
      if (true)
        return new Ord4Search(n0, n2, n3);
    }
    throw new Error("Missing return statement in function");
  }

  final public FieldSearch FieldSearch() throws ParseException {
    NodeToken n0;
    Token n1;
    CheckOrd1Search n2;
    NodeToken n3;
    Token n4;
    n1 = jj_consume_token(FIELDSTART);
    n0 = JTBToolkit.makeNodeToken(n1);
    n2 = CheckOrd1Search();
    n4 = jj_consume_token(28);
    n3 = JTBToolkit.makeNodeToken(n4);
    {
      if (true)
        return new FieldSearch(n0, n2, n3);
    }
    throw new Error("Missing return statement in function");
  }

  final public SearchToken SearchToken() throws ParseException {
    NodeChoice n0;
    NodeToken n1;
    Token n2;
    NodeToken n3;
    Token n4;
    NodeToken n5;
    Token n6;
    NodeToken n7;
    Token n8;
    NodeToken n9;
    Token n10;
    NodeToken n11;
    Token n12;
    NodeToken n13;
    Token n14;
    NodeToken n15;
    Token n16;
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case MATCHALL:
      n2 = jj_consume_token(MATCHALL);
      n1 = JTBToolkit.makeNodeToken(n2);
      n0 = new NodeChoice(n1, 0);
      break;
    case QUOTED:
      n4 = jj_consume_token(QUOTED);
      n3 = JTBToolkit.makeNodeToken(n4);
      n0 = new NodeChoice(n3, 1);
      break;
    case BOOSTEDQUOTED:
      n6 = jj_consume_token(BOOSTEDQUOTED);
      n5 = JTBToolkit.makeNodeToken(n6);
      n0 = new NodeChoice(n5, 2);
      break;
    case RANGE:
      n8 = jj_consume_token(RANGE);
      n7 = JTBToolkit.makeNodeToken(n8);
      n0 = new NodeChoice(n7, 3);
      break;
    case WILDCARD:
      n10 = jj_consume_token(WILDCARD);
      n9 = JTBToolkit.makeNodeToken(n10);
      n0 = new NodeChoice(n9, 4);
      break;
    case FUZZY:
      n12 = jj_consume_token(FUZZY);
      n11 = JTBToolkit.makeNodeToken(n12);
      n0 = new NodeChoice(n11, 5);
      break;
    case BOOSTEDSEARCHTOKEN:
      n14 = jj_consume_token(BOOSTEDSEARCHTOKEN);
      n13 = JTBToolkit.makeNodeToken(n14);
      n0 = new NodeChoice(n13, 6);
      break;
    case SEARCHTOKEN:
      n16 = jj_consume_token(SEARCHTOKEN);
      n15 = JTBToolkit.makeNodeToken(n16);
      n0 = new NodeChoice(n15, 7);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {
      if (true)
        return new SearchToken(n0);
    }
    throw new Error("Missing return statement in function");
  }

  final public ParenthesisSearch ParenthesisSearch() throws ParseException {
    NodeToken n0;
    Token n1;
    CheckOrd1Search n2;
    NodeToken n3;
    Token n4;
    n1 = jj_consume_token(29);
    n0 = JTBToolkit.makeNodeToken(n1);
    n2 = CheckOrd1Search();
    n4 = jj_consume_token(28);
    n3 = JTBToolkit.makeNodeToken(n4);
    {
      if (true)
        return new ParenthesisSearch(n0, n2, n3);
    }
    throw new Error("Missing return statement in function");
  }

  final public BasicSearch BasicSearch() throws ParseException {
    NodeList n0 = new NodeList();
    BasicSearchType n1;
    label_1: while (true) {
      n1 = BasicSearchType();
      n0.addNode(n1);
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case MATCHALL:
      case QUOTED:
      case BOOSTEDQUOTED:
      case FUZZY:
      case RANGE:
      case FIELDSTART:
      case BOOSTEDSEARCHTOKEN:
      case SEARCHTOKEN:
      case WILDCARD:
      case 29:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_1;
      }
    }
    n0.nodes.trimToSize();
    {
      if (true)
        return new BasicSearch(n0);
    }
    throw new Error("Missing return statement in function");
  }

  final public BasicSearchType BasicSearchType() throws ParseException {
    NodeChoice n0;
    FieldSearch n1;
    SearchToken n2;
    ParenthesisSearch n3;
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case FIELDSTART:
      n1 = FieldSearch();
      n0 = new NodeChoice(n1, 0);
      break;
    case MATCHALL:
    case QUOTED:
    case BOOSTEDQUOTED:
    case FUZZY:
    case RANGE:
    case BOOSTEDSEARCHTOKEN:
    case SEARCHTOKEN:
    case WILDCARD:
      n2 = SearchToken();
      n0 = new NodeChoice(n2, 1);
      break;
    case 29:
      n3 = ParenthesisSearch();
      n0 = new NodeChoice(n3, 2);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {
      if (true)
        return new BasicSearchType(n0);
    }
    throw new Error("Missing return statement in function");
  }

  public QueryParserTokenManager token_source;
  JavaCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[11];
  static private int[] jj_la1_0;
  static {
    jj_la1_0();
  }

  private static void jj_la1_0() {
    jj_la1_0 = new int[] { 0x400000, 0x400000, 0x800000, 0x800000, 0x1000000,
        0x1000000, 0x2000000, 0x2000000, 0x3be000, 0x203fe000, 0x203fe000, };
  }

  public QueryParser(java.io.InputStream stream) {
    this(stream, null);
  }

  public QueryParser(java.io.InputStream stream, String encoding) {
    try {
      jj_input_stream = new JavaCharStream(stream, encoding, 1, 1);
    } catch (java.io.UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    token_source = new QueryParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++)
      jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
    ReInit(stream, null);
  }

  public void ReInit(java.io.InputStream stream, String encoding) {
    try {
      jj_input_stream.ReInit(stream, encoding, 1, 1);
    } catch (java.io.UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++)
      jj_la1[i] = -1;
  }

  public QueryParser(java.io.Reader stream) {
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new QueryParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++)
      jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++)
      jj_la1[i] = -1;
  }

  public QueryParser(QueryParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++)
      jj_la1[i] = -1;
  }

  public void ReInit(QueryParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 11; i++)
      jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null)
      token = token.next;
    else
      token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null)
      token = token.next;
    else
      token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null)
        t = t.next;
      else
        t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt = token.next) == null)
      return (jj_ntk = (token.next = token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[30];
    for (int i = 0; i < 30; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 11; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1 << j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 30; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[]) jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}

class JTBToolkit {
  static NodeToken makeNodeToken(Token t) {
    return new NodeToken(t.image.intern(), t.kind, t.beginLine, t.beginColumn,
        t.endLine, t.endColumn);
  }
}
