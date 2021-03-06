/* Generated By:JavaCC: Do not edit this line. QueryParserTokenManager.java */
package com.mhs.qsol.queryparser;

import java.util.Map;
import com.mhs.qsol.QsolParser.Operator;
import com.mhs.qsol.syntaxtree.*;
import java.util.Vector;

public class QueryParserTokenManager implements QueryParserConstants {
  Map orderOfOps;
  boolean hideAnd;
  boolean hideOr;
  boolean hideAndNot;
  boolean hideProximity;
  public java.io.PrintStream debugStream = System.out;

  public void setDebugStream(java.io.PrintStream ds) {
    debugStream = ds;
  }

  private final int jjStopStringLiteralDfa_0(int pos, long active0) {
    switch (pos) {
    case 0:
      if ((active0 & 0x23cL) != 0L)
        return 65;
      if ((active0 & 0x2000L) != 0L) {
        jjmatchedKind = 21;
        return 66;
      }
      if ((active0 & 0x3c00000L) != 0L) {
        jjmatchedKind = 20;
        return 10;
      }
      return -1;
    case 1:
      if ((active0 & 0x3c00000L) != 0L) {
        jjmatchedKind = 20;
        jjmatchedPos = 1;
        return 65;
      }
      if ((active0 & 0x2000L) != 0L) {
        jjmatchedKind = 21;
        jjmatchedPos = 1;
        return 66;
      }
      return -1;
    default:
      return -1;
    }
  }

  private final int jjStartNfa_0(int pos, long active0) {
    return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
  }

  private final int jjStopAtPos(int pos, int kind) {
    jjmatchedKind = kind;
    jjmatchedPos = pos;
    return pos + 1;
  }

  private final int jjStartNfaWithStates_0(int pos, int kind, int state) {
    jjmatchedKind = kind;
    jjmatchedPos = pos;
    try {
      curChar = input_stream.readChar();
    } catch (java.io.IOException e) {
      return pos + 1;
    }
    return jjMoveNfa_0(state, pos + 1);
  }

  private final int jjMoveStringLiteralDfa0_0() {
    switch (curChar) {
    case 9:
      return jjStartNfaWithStates_0(0, 2, 65);
    case 10:
      return jjStartNfaWithStates_0(0, 3, 65);
    case 12:
      return jjStartNfaWithStates_0(0, 5, 65);
    case 13:
      return jjStartNfaWithStates_0(0, 4, 65);
    case 38:
      return jjStartNfaWithStates_0(0, 9, 65);
    case 40:
      return jjStopAtPos(0, 29);
    case 41:
      return jjStopAtPos(0, 28);
    case 42:
      return jjMoveStringLiteralDfa1_0(0x2000L);
    case 79:
    case 111:
      return jjMoveStringLiteralDfa1_0(0x3c00000L);
    default:
      return jjMoveNfa_0(0, 0);
    }
  }

  private final int jjMoveStringLiteralDfa1_0(long active0) {
    try {
      curChar = input_stream.readChar();
    } catch (java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
    }
    switch (curChar) {
    case 58:
      return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
    case 80:
    case 112:
      return jjMoveStringLiteralDfa2_0(active0, 0x3c00000L);
    default:
      break;
    }
    return jjStartNfa_0(0, active0);
  }

  private final int jjMoveStringLiteralDfa2_0(long old0, long active0) {
    if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
    try {
      curChar = input_stream.readChar();
    } catch (java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
    }
    switch (curChar) {
    case 42:
      if ((active0 & 0x2000L) != 0L)
        return jjStartNfaWithStates_0(2, 13, 66);
      break;
    case 49:
      if ((active0 & 0x400000L) != 0L)
        return jjStartNfaWithStates_0(2, 20, 65);
      break;
    case 50:
      if ((active0 & 0x800000L) != 0L)
        return jjStartNfaWithStates_0(2, 20, 65);
      break;
    case 51:
      if ((active0 & 0x1000000L) != 0L)
        return jjStartNfaWithStates_0(2, 20, 65);
      break;
    case 52:
      if ((active0 & 0x2000000L) != 0L)
        return jjStartNfaWithStates_0(2, 20, 65);
      break;
    default:
      break;
    }
    return jjStartNfa_0(1, active0);
  }

  private final void jjCheckNAdd(int state) {
    if (jjrounds[state] != jjround) {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
    }
  }

  private final void jjAddStates(int start, int end) {
    do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
    } while (start++ != end);
  }

  private final void jjCheckNAddTwoStates(int state1, int state2) {
    jjCheckNAdd(state1);
    jjCheckNAdd(state2);
  }

  private final void jjCheckNAddStates(int start, int end) {
    do {
      jjCheckNAdd(jjnextStates[start]);
    } while (start++ != end);
  }

  private final void jjCheckNAddStates(int start) {
    jjCheckNAdd(jjnextStates[start]);
    jjCheckNAdd(jjnextStates[start + 1]);
  }

  static final long[] jjbitVec0 = { 0x1600L, 0x0L, 0x0L, 0x0L };
  static final long[] jjbitVec1 = { 0x0L, 0xffc000000000L, 0x0L,
      0xffc000000000L };
  static final long[] jjbitVec2 = { 0x0L, 0x3ff00000000L, 0x0L,
      0x3ff000000000000L };
  static final long[] jjbitVec3 = { 0x0L, 0xffc000000000L, 0x0L,
      0xff8000000000L };
  static final long[] jjbitVec4 = { 0x0L, 0xffc000000000L, 0x0L, 0x0L };
  static final long[] jjbitVec5 = { 0x0L, 0x3ff0000L, 0x0L, 0x3ff0000L };
  static final long[] jjbitVec6 = { 0x0L, 0x3ffL, 0x0L, 0x0L };
  static final long[] jjbitVec7 = { 0xfffffffffffffffeL, 0xffffffffffffffffL,
      0xffffffffffffffffL, 0xffffffffffffffffL };
  static final long[] jjbitVec9 = { 0x0L, 0x0L, 0xffffffffffffffffL,
      0xffffffffffffffffL };

  private final int jjMoveNfa_0(int startState, int curPos) {
    int[] nextStates;
    int startsAt = 0;
    jjnewStateCnt = 65;
    int i = 1;
    jjstateSet[0] = startState;
    int j, kind = 0x7fffffff;
    for (;;) {
      if (++jjround == 0x7fffffff)
        ReInitRounds();
      if (curChar < 64) {
        long l = 1L << curChar;
        MatchLoop: do {
          switch (jjstateSet[--i]) {
          case 0:
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(35, 36);
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            if ((0x7ffff8feffffffffL & l) != 0L) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddStates(0, 10);
            } else if ((0x8000040000000000L & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            if (curChar == 34)
              jjCheckNAddTwoStates(41, 45);
            else if (curChar == 33)
              jjstateSet[jjnewStateCnt++] = 4;
            if (curChar == 33) {
              if (kind > 11)
                kind = 11;
            }
            break;
          case 66:
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(35, 36);
            else if (curChar == 40) {
              if (kind > 18)
                kind = 18;
            }
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            if ((0x7ffff8feffffffffL & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            } else if ((0x8000040000000000L & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            break;
          case 10:
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(35, 36);
            else if (curChar == 32)
              jjAddStates(14, 16);
            else if (curChar == 40) {
              if (kind > 18)
                kind = 18;
            }
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            if ((0x7ffff8feffffffffL & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            } else if ((0x8000040000000000L & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            if ((0x7ffff8feffffffffL & l) != 0L) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddTwoStates(62, 63);
            }
            if ((0x7ffff8feffffffffL & l) != 0L)
              jjCheckNAddStates(17, 19);
            if ((0x7ffff8feffffffffL & l) != 0L)
              jjCheckNAddStates(20, 22);
            break;
          case 65:
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(35, 36);
            else if (curChar == 32)
              jjAddStates(14, 16);
            else if (curChar == 40) {
              if (kind > 18)
                kind = 18;
            }
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            if ((0x7ffff8feffffffffL & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            } else if ((0x8000040000000000L & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            if ((0x7ffff8feffffffffL & l) != 0L) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddTwoStates(62, 63);
            }
            if ((0x7ffff8feffffffffL & l) != 0L)
              jjCheckNAddStates(17, 19);
            if ((0x7ffff8feffffffffL & l) != 0L)
              jjCheckNAddStates(20, 22);
            break;
          case 3:
          case 4:
            if (curChar == 33 && kind > 11)
              kind = 11;
            break;
          case 5:
            if (curChar == 33)
              jjstateSet[jjnewStateCnt++] = 4;
            break;
          case 8:
            if ((0x3ff000000000000L & l) == 0L)
              break;
            if (kind > 12)
              kind = 12;
            jjAddStates(23, 24);
            break;
          case 15:
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            break;
          case 19:
            if ((0x8000040000000000L & l) != 0L)
              jjCheckNAddStates(20, 22);
            break;
          case 20:
            if ((0x7ffff8feffffffffL & l) != 0L)
              jjCheckNAddStates(20, 22);
            break;
          case 21:
            if (curChar == 32)
              jjAddStates(14, 16);
            break;
          case 22:
            if (curChar == 32)
              jjCheckNAddTwoStates(23, 25);
            break;
          case 24:
            if ((0x8000040000000000L & l) == 0L)
              break;
            if (kind > 17)
              kind = 17;
            jjCheckNAddStates(25, 27);
            break;
          case 25:
            if ((0x7ffff8feffffffffL & l) == 0L)
              break;
            if (kind > 17)
              kind = 17;
            jjCheckNAddStates(25, 27);
            break;
          case 35:
            if ((0xfffffcfeffffffffL & l) != 0L)
              jjCheckNAddTwoStates(35, 36);
            break;
          case 36:
            if (curChar == 40 && kind > 18)
              kind = 18;
            break;
          case 37:
            if ((0x8000040000000000L & l) == 0L)
              break;
            if (kind > 21)
              kind = 21;
            jjCheckNAddStates(11, 13);
            break;
          case 39:
            if ((0x7ffff8feffffffffL & l) == 0L)
              break;
            if (kind > 21)
              kind = 21;
            jjCheckNAddStates(11, 13);
            break;
          case 40:
            if (curChar == 34)
              jjCheckNAddTwoStates(41, 45);
            break;
          case 41:
            if ((0xfffffffbffffffffL & l) != 0L)
              jjCheckNAddTwoStates(41, 42);
            break;
          case 42:
            if (curChar != 34)
              break;
            if (kind > 14)
              kind = 14;
            jjstateSet[jjnewStateCnt++] = 43;
            break;
          case 43:
            if (curChar != 58)
              break;
            if (kind > 14)
              kind = 14;
            jjCheckNAdd(44);
            break;
          case 44:
            if ((0x3ff000000000000L & l) == 0L)
              break;
            if (kind > 14)
              kind = 14;
            jjCheckNAdd(44);
            break;
          case 45:
            if ((0xfffffffbffffffffL & l) != 0L)
              jjCheckNAddTwoStates(45, 46);
            break;
          case 46:
            if (curChar == 34)
              jjCheckNAddTwoStates(47, 49);
            break;
          case 47:
            if (curChar == 58)
              jjCheckNAddTwoStates(48, 49);
            break;
          case 48:
            if ((0x3ff000000000000L & l) != 0L)
              jjCheckNAddTwoStates(48, 49);
            break;
          case 50:
            if ((0x3ff000000000000L & l) == 0L)
              break;
            if (kind > 15)
              kind = 15;
            jjAddStates(28, 29);
            break;
          case 51:
            if (curChar == 46)
              jjCheckNAdd(52);
            break;
          case 52:
            if ((0x3ff000000000000L & l) == 0L)
              break;
            if (kind > 15)
              kind = 15;
            jjCheckNAdd(52);
            break;
          case 54:
            if ((0x8000040000000000L & l) != 0L)
              jjCheckNAddStates(17, 19);
            break;
          case 56:
            if ((0x7ffff8feffffffffL & l) != 0L)
              jjCheckNAddStates(17, 19);
            break;
          case 58:
            if ((0x3ff000000000000L & l) == 0L)
              break;
            if (kind > 19)
              kind = 19;
            jjAddStates(30, 31);
            break;
          case 59:
            if (curChar == 46)
              jjCheckNAdd(60);
            break;
          case 60:
            if ((0x3ff000000000000L & l) == 0L)
              break;
            if (kind > 19)
              kind = 19;
            jjCheckNAdd(60);
            break;
          case 61:
            if ((0x8000040000000000L & l) == 0L)
              break;
            if (kind > 20)
              kind = 20;
            jjCheckNAddTwoStates(62, 63);
            break;
          case 63:
            if ((0x7ffff8feffffffffL & l) == 0L)
              break;
            if (kind > 20)
              kind = 20;
            jjCheckNAddTwoStates(62, 63);
            break;
          case 64:
            if ((0x7ffff8feffffffffL & l) == 0L)
              break;
            if (kind > 20)
              kind = 20;
            jjCheckNAddStates(0, 10);
            break;
          default:
            break;
          }
        } while (i != startsAt);
      } else if (curChar < 128) {
        long l = 1L << (curChar & 077);
        MatchLoop: do {
          switch (jjstateSet[--i]) {
          case 0:
            jjCheckNAddTwoStates(35, 36);
            if ((0xffffffffd7ffffffL & l) != 0L) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddStates(0, 10);
            }
            if ((0xfffffffed7ffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            if ((0x800000008000000L & l) != 0L)
              jjCheckNAddTwoStates(18, 20);
            else if ((0x1000000010000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 13;
            else if ((0x800000008000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 10;
            else if (curChar == 92)
              jjCheckNAddStates(32, 35);
            else if (curChar == 126) {
              if (kind > 12)
                kind = 12;
              jjAddStates(23, 24);
            } else if (curChar == 124)
              jjstateSet[jjnewStateCnt++] = 1;
            if (curChar == 124) {
              if (kind > 10)
                kind = 10;
            }
            break;
          case 66:
            jjCheckNAddTwoStates(35, 36);
            if ((0xffffffffd7ffffffL & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            if ((0xfffffffed7ffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            else if (curChar == 96) {
              if (kind > 16)
                kind = 16;
            }
            if (curChar == 92)
              jjCheckNAdd(37);
            break;
          case 10:
            jjCheckNAddTwoStates(35, 36);
            if ((0xffffffffd7ffffffL & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            if ((0xffffffffd7ffffffL & l) != 0L) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddTwoStates(62, 63);
            }
            if ((0xffffffffd7ffffffL & l) != 0L)
              jjCheckNAddStates(17, 19);
            if ((0xffffffffd7ffffffL & l) != 0L)
              jjCheckNAddStates(20, 22);
            if ((0xfffffffed7ffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            else if (curChar == 96) {
              if (kind > 16)
                kind = 16;
            }
            if ((0x4000000040000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 6;
            else if (curChar == 92)
              jjCheckNAdd(37);
            else if (curChar == 94)
              jjstateSet[jjnewStateCnt++] = 58;
            if (curChar == 92)
              jjCheckNAdd(61);
            if (curChar == 92)
              jjCheckNAdd(54);
            if (curChar == 92)
              jjCheckNAdd(19);
            break;
          case 65:
            jjCheckNAddTwoStates(35, 36);
            if ((0xffffffffd7ffffffL & l) != 0L) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            if ((0xffffffffd7ffffffL & l) != 0L) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddTwoStates(62, 63);
            }
            if ((0xffffffffd7ffffffL & l) != 0L)
              jjCheckNAddStates(17, 19);
            if ((0xffffffffd7ffffffL & l) != 0L)
              jjCheckNAddStates(20, 22);
            if ((0xfffffffed7ffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            else if (curChar == 96) {
              if (kind > 16)
                kind = 16;
            }
            if (curChar == 92)
              jjCheckNAdd(37);
            else if (curChar == 94)
              jjstateSet[jjnewStateCnt++] = 58;
            if (curChar == 92)
              jjCheckNAdd(61);
            if (curChar == 92)
              jjCheckNAdd(54);
            if (curChar == 92)
              jjCheckNAdd(19);
            break;
          case 1:
            if (curChar == 124 && kind > 10)
              kind = 10;
            break;
          case 2:
            if (curChar == 124)
              jjstateSet[jjnewStateCnt++] = 1;
            break;
          case 6:
            if ((0x1000000010L & l) != 0L)
              jjCheckNAdd(7);
            break;
          case 7:
            if (curChar != 126)
              break;
            if (kind > 12)
              kind = 12;
            jjAddStates(23, 24);
            break;
          case 9:
            if ((0x9000000090000L & l) != 0L && kind > 12)
              kind = 12;
            break;
          case 11:
            if ((0x800000008000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 10;
            break;
          case 12:
            if ((0x2000000020L & l) != 0L)
              jjCheckNAdd(7);
            break;
          case 13:
            if ((0x4000000040000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 12;
            break;
          case 14:
            if ((0x1000000010000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 13;
            break;
          case 15:
            if ((0xfffffffed7ffffffL & l) != 0L)
              jjCheckNAddTwoStates(15, 16);
            break;
          case 16:
            if (curChar == 96 && kind > 16)
              kind = 16;
            break;
          case 17:
            if ((0x800000008000000L & l) != 0L)
              jjCheckNAddTwoStates(18, 20);
            break;
          case 18:
            if (curChar == 92)
              jjCheckNAdd(19);
            break;
          case 20:
            if ((0xffffffffd7ffffffL & l) != 0L)
              jjCheckNAddStates(20, 22);
            break;
          case 23:
            if (curChar == 92)
              jjstateSet[jjnewStateCnt++] = 24;
            break;
          case 25:
            if ((0xffffffffd7ffffffL & l) == 0L)
              break;
            if (kind > 17)
              kind = 17;
            jjAddStates(25, 27);
            break;
          case 26:
            if ((0x2000000020000000L & l) != 0L && kind > 17)
              kind = 17;
            break;
          case 27:
            if ((0x800000008000L & l) != 0L)
              jjCheckNAdd(22);
            break;
          case 28:
            if ((0x10000000100000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 27;
            break;
          case 29:
          case 32:
            if ((0x8000000080L & l) != 0L)
              jjCheckNAdd(22);
            break;
          case 30:
            if ((0x400000004000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 29;
            break;
          case 31:
            if ((0x4000000040000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 30;
            break;
          case 33:
            if ((0x400000004000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 32;
            break;
          case 34:
            if ((0x4000000040000L & l) != 0L)
              jjstateSet[jjnewStateCnt++] = 33;
            break;
          case 35:
            jjCheckNAddTwoStates(35, 36);
            break;
          case 38:
            if (curChar == 92)
              jjCheckNAdd(37);
            break;
          case 39:
            if ((0xffffffffd7ffffffL & l) == 0L)
              break;
            if (kind > 21)
              kind = 21;
            jjCheckNAddStates(11, 13);
            break;
          case 41:
            jjAddStates(36, 37);
            break;
          case 45:
            jjAddStates(38, 39);
            break;
          case 49:
            if (curChar == 94)
              jjstateSet[jjnewStateCnt++] = 50;
            break;
          case 53:
            if (curChar == 92)
              jjCheckNAddStates(32, 35);
            break;
          case 55:
            if (curChar == 92)
              jjCheckNAdd(54);
            break;
          case 56:
            if ((0xffffffffd7ffffffL & l) != 0L)
              jjCheckNAddStates(17, 19);
            break;
          case 57:
            if (curChar == 94)
              jjstateSet[jjnewStateCnt++] = 58;
            break;
          case 62:
            if (curChar == 92)
              jjCheckNAdd(61);
            break;
          case 63:
            if ((0xffffffffd7ffffffL & l) == 0L)
              break;
            if (kind > 20)
              kind = 20;
            jjCheckNAddTwoStates(62, 63);
            break;
          case 64:
            if ((0xffffffffd7ffffffL & l) == 0L)
              break;
            if (kind > 20)
              kind = 20;
            jjCheckNAddStates(0, 10);
            break;
          default:
            break;
          }
        } while (i != startsAt);
      } else {
        int hiByte = (int) (curChar >> 8);
        int i1 = hiByte >> 6;
        long l1 = 1L << (hiByte & 077);
        int i2 = (curChar & 0xff) >> 6;
        long l2 = 1L << (curChar & 077);
        MatchLoop: do {
          switch (jjstateSet[--i]) {
          case 0:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(15, 16);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(35, 36);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2)) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddStates(0, 10);
            }
            break;
          case 66:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(15, 16);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(35, 36);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2)) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            break;
          case 10:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(15, 16);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddStates(20, 22);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(35, 36);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddStates(17, 19);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2)) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddTwoStates(62, 63);
            }
            if (jjCanMove_1(hiByte, i1, i2, l1, l2)) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            break;
          case 65:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(15, 16);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddStates(20, 22);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(35, 36);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddStates(17, 19);
            if (jjCanMove_1(hiByte, i1, i2, l1, l2)) {
              if (kind > 20)
                kind = 20;
              jjCheckNAddTwoStates(62, 63);
            }
            if (jjCanMove_1(hiByte, i1, i2, l1, l2)) {
              if (kind > 21)
                kind = 21;
              jjCheckNAddStates(11, 13);
            }
            break;
          case 8:
            if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 12)
              kind = 12;
            jjAddStates(23, 24);
            break;
          case 15:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(15, 16);
            break;
          case 20:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddStates(20, 22);
            break;
          case 25:
            if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 17)
              kind = 17;
            jjAddStates(25, 27);
            break;
          case 35:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddTwoStates(35, 36);
            break;
          case 39:
            if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 21)
              kind = 21;
            jjCheckNAddStates(11, 13);
            break;
          case 41:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjAddStates(36, 37);
            break;
          case 44:
            if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 14)
              kind = 14;
            jjstateSet[jjnewStateCnt++] = 44;
            break;
          case 45:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjAddStates(38, 39);
            break;
          case 48:
            if (jjCanMove_0(hiByte, i1, i2, l1, l2))
              jjAddStates(40, 41);
            break;
          case 50:
            if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 15)
              kind = 15;
            jjAddStates(28, 29);
            break;
          case 52:
            if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 15)
              kind = 15;
            jjstateSet[jjnewStateCnt++] = 52;
            break;
          case 56:
            if (jjCanMove_1(hiByte, i1, i2, l1, l2))
              jjCheckNAddStates(17, 19);
            break;
          case 58:
            if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 19)
              kind = 19;
            jjAddStates(30, 31);
            break;
          case 60:
            if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 19)
              kind = 19;
            jjstateSet[jjnewStateCnt++] = 60;
            break;
          case 63:
            if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 20)
              kind = 20;
            jjCheckNAddTwoStates(62, 63);
            break;
          case 64:
            if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
              break;
            if (kind > 20)
              kind = 20;
            jjCheckNAddStates(0, 10);
            break;
          default:
            break;
          }
        } while (i != startsAt);
      }
      if (kind != 0x7fffffff) {
        jjmatchedKind = kind;
        jjmatchedPos = curPos;
        kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 65 - (jjnewStateCnt = startsAt)))
        return curPos;
      try {
        curChar = input_stream.readChar();
      } catch (java.io.IOException e) {
        return curPos;
      }
    }
  }

  static final int[] jjnextStates = { 18, 20, 55, 56, 57, 62, 63, 38, 39, 37,
      21, 38, 39, 37, 28, 31, 34, 55, 56, 57, 18, 20, 21, 8, 9, 23, 25, 26, 50,
      51, 58, 59, 19, 54, 61, 37, 41, 42, 45, 46, 48, 49, };

  private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1,
      long l2) {
    switch (hiByte) {
    case 6:
      return ((jjbitVec2[i2] & l2) != 0L);
    case 11:
      return ((jjbitVec3[i2] & l2) != 0L);
    case 13:
      return ((jjbitVec4[i2] & l2) != 0L);
    case 14:
      return ((jjbitVec5[i2] & l2) != 0L);
    case 16:
      return ((jjbitVec6[i2] & l2) != 0L);
    default:
      if ((jjbitVec0[i1] & l1) != 0L)
        if ((jjbitVec1[i2] & l2) == 0L)
          return false;
        else
          return true;
      return false;
    }
  }

  private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1,
      long l2) {
    switch (hiByte) {
    case 0:
      return ((jjbitVec9[i2] & l2) != 0L);
    default:
      if ((jjbitVec7[i1] & l1) != 0L)
        return true;
      return false;
    }
  }

  public static final String[] jjstrLiteralImages = { "", null, null, null,
      null, null, null, null, null, "\46", null, null, null, "\52\72\52", null,
      null, null, null, null, null, null, null, null, null, null, null, null,
      null, "\51", "\50", };
  public static final String[] lexStateNames = { "DEFAULT", };
  static final long[] jjtoToken = { 0x33fffe01L, };
  static final long[] jjtoSkip = { 0x3eL, };
  protected JavaCharStream input_stream;
  private final int[] jjrounds = new int[65];
  private final int[] jjstateSet = new int[130];
  StringBuffer image;
  int jjimageLen;
  int lengthOfMatch;
  protected char curChar;

  public QueryParserTokenManager(JavaCharStream stream) {
    if (JavaCharStream.staticFlag)
      throw new Error(
          "ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
    input_stream = stream;
  }

  public QueryParserTokenManager(JavaCharStream stream, int lexState) {
    this(stream);
    SwitchTo(lexState);
  }

  public void ReInit(JavaCharStream stream) {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private final void ReInitRounds() {
    int i;
    jjround = 0x80000001;
    for (i = 65; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  public void ReInit(JavaCharStream stream, int lexState) {
    ReInit(stream);
    SwitchTo(lexState);
  }

  public void SwitchTo(int lexState) {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : "
          + lexState + ". State unchanged.",
          TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

  protected Token jjFillToken() {
    Token t = Token.newToken(jjmatchedKind);
    t.kind = jjmatchedKind;
    String im = jjstrLiteralImages[jjmatchedKind];
    t.image = (im == null) ? input_stream.GetImage() : im;
    t.beginLine = input_stream.getBeginLine();
    t.beginColumn = input_stream.getBeginColumn();
    t.endLine = input_stream.getEndLine();
    t.endColumn = input_stream.getEndColumn();
    return t;
  }

  int curLexState = 0;
  int defaultLexState = 0;
  int jjnewStateCnt;
  int jjround;
  int jjmatchedPos;
  int jjmatchedKind;

  public Token getNextToken() {
    int kind;
    Token specialToken = null;
    Token matchedToken;
    int curPos = 0;

    EOFLoop: for (;;) {
      try {
        curChar = input_stream.BeginToken();
      } catch (java.io.IOException e) {
        jjmatchedKind = 0;
        matchedToken = jjFillToken();
        return matchedToken;
      }
      image = null;
      jjimageLen = 0;

      try {
        input_stream.backup(0);
        while (curChar <= 32 && (0x100000000L & (1L << curChar)) != 0L)
          curChar = input_stream.BeginToken();
      } catch (java.io.IOException e1) {
        continue EOFLoop;
      }
      jjmatchedKind = 0x7fffffff;
      jjmatchedPos = 0;
      curPos = jjMoveStringLiteralDfa0_0();
      if (jjmatchedKind != 0x7fffffff) {
        if (jjmatchedPos + 1 < curPos)
          input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
          matchedToken = jjFillToken();
          TokenLexicalActions(matchedToken);
          return matchedToken;
        } else {
          continue EOFLoop;
        }
      }
      int error_line = input_stream.getEndLine();
      int error_column = input_stream.getEndColumn();
      String error_after = null;
      boolean EOFSeen = false;
      try {
        input_stream.readChar();
        input_stream.backup(1);
      } catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
          error_line++;
          error_column = 0;
        } else
          error_column++;
      }
      if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
      }
      throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column,
          error_after, curChar, TokenMgrError.LEXICAL_ERROR);
    }
  }

  void TokenLexicalActions(Token matchedToken) {
    switch (jjmatchedKind) {
    case 9:
      if (image == null)
        image = new StringBuffer();
      image.append(jjstrLiteralImages[9]);
      if (hideAnd) {
        matchedToken.kind = SEARCHTOKEN;
        matchedToken.image = "\\" + matchedToken.image;
      } else {
        matchedToken.kind = (Integer) orderOfOps.get(Operator.AND);
      }
      break;
    case 10:
      if (image == null)
        image = new StringBuffer();
      image.append(input_stream.GetSuffix(jjimageLen
          + (lengthOfMatch = jjmatchedPos + 1)));
      if (hideOr) {
        matchedToken.kind = SEARCHTOKEN;
        matchedToken.image = "\\" + matchedToken.image;
      } else {
        if (matchedToken.image.length() == 1) {
          matchedToken.kind = (Integer) orderOfOps.get(Operator.OR);
        } else {
          matchedToken.kind = OP4;
        }
      }
      break;
    case 11:
      if (image == null)
        image = new StringBuffer();
      image.append(input_stream.GetSuffix(jjimageLen
          + (lengthOfMatch = jjmatchedPos + 1)));
      if (hideAndNot) {
        matchedToken.kind = SEARCHTOKEN;
        matchedToken.image = "\\" + matchedToken.image;
      } else {
        if (matchedToken.image.length() == 1) {
          matchedToken.kind = (Integer) orderOfOps.get(Operator.ANDNOT);
        } else {
          matchedToken.kind = OP4;
        }
      }
      break;
    case 12:
      if (image == null)
        image = new StringBuffer();
      image.append(input_stream.GetSuffix(jjimageLen
          + (lengthOfMatch = jjmatchedPos + 1)));
      if (hideProximity) {
        matchedToken.kind = SEARCHTOKEN;
        matchedToken.image = "\\" + matchedToken.image;
      } else {
        String text = matchedToken.image;
        matchedToken.kind = (Integer) orderOfOps.get(Operator.PROXIMITY);
      }
      break;
    case 18:
      if (image == null)
        image = new StringBuffer();
      image.append(input_stream.GetSuffix(jjimageLen
          + (lengthOfMatch = jjmatchedPos + 1)));
      String text = matchedToken.image;
      matchedToken.image = text.substring(0, text.length() - 1);
      break;
    default:
      break;
    }
  }
}
