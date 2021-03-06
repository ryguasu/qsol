//
// Generated by JTB 1.3.2
//

package com.mhs.qsol.visitor;

import com.mhs.qsol.syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

  //
  // GJ Auto class visitors with no argument
  //

  public R visit(NodeList n);

  public R visit(NodeListOptional n);

  public R visit(NodeOptional n);

  public R visit(NodeSequence n);

  public R visit(NodeToken n);

  //
  // User-generated visitor methods below
  //

  /**
   * f0 -> CheckOrd1Search() f1 -> <EOF>
   */
  public R visit(Search n);

  /**
   * f0 -> CheckOrd2Search() f1 -> ( Ord1Search() )?
   */
  public R visit(CheckOrd1Search n);

  /**
   * f0 -> <OP1> f1 -> CheckOrd2Search() f2 -> ( Ord1Search() )?
   */
  public R visit(Ord1Search n);

  /**
   * f0 -> CheckOrd3Search() f1 -> ( Ord2Search() )?
   */
  public R visit(CheckOrd2Search n);

  /**
   * f0 -> <OP2> f1 -> CheckOrd3Search() f2 -> ( Ord2Search() )?
   */
  public R visit(Ord2Search n);

  /**
   * f0 -> CheckOrd4Search() f1 -> ( Ord3Search() )?
   */
  public R visit(CheckOrd3Search n);

  /**
   * f0 -> <OP3> f1 -> CheckOrd4Search() f2 -> ( Ord3Search() )?
   */
  public R visit(Ord3Search n);

  /**
   * f0 -> BasicSearch() f1 -> ( Ord4Search() )?
   */
  public R visit(CheckOrd4Search n);

  /**
   * f0 -> <OP4> f1 -> BasicSearch() f2 -> ( Ord4Search() )?
   */
  public R visit(Ord4Search n);

  /**
   * f0 -> <FIELDSTART> f1 -> CheckOrd1Search() f2 -> ")"
   */
  public R visit(FieldSearch n);

  /**
   * f0 -> <MATCHALL> | <QUOTED> | <BOOSTEDQUOTED> | <RANGE> | <WILDCARD> |
   * <FUZZY> | <BOOSTEDSEARCHTOKEN> | <SEARCHTOKEN>
   */
  public R visit(SearchToken n);

  /**
   * f0 -> "(" f1 -> CheckOrd1Search() f2 -> ")"
   */
  public R visit(ParenthesisSearch n);

  /**
   * f0 -> ( BasicSearchType() )+
   */
  public R visit(BasicSearch n);

  /**
   * f0 -> FieldSearch() | SearchToken() | ParenthesisSearch()
   */
  public R visit(BasicSearchType n);

}
