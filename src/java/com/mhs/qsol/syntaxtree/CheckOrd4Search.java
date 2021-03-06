//
// Generated by JTB 1.3.2
//

package com.mhs.qsol.syntaxtree;

/**
 * Grammar production: f0 -> BasicSearch() f1 -> ( Ord4Search() )?
 */
public class CheckOrd4Search implements Node {
  public BasicSearch f0;
  public NodeOptional f1;

  public CheckOrd4Search(BasicSearch n0, NodeOptional n1) {
    f0 = n0;
    f1 = n1;
  }

  public void accept(com.mhs.qsol.visitor.Visitor v) {
    v.visit(this);
  }

  public <R, A> R accept(com.mhs.qsol.visitor.GJVisitor<R, A> v, A argu) {
    return v.visit(this, argu);
  }

  public <R> R accept(com.mhs.qsol.visitor.GJNoArguVisitor<R> v) {
    return v.visit(this);
  }

  public <A> void accept(com.mhs.qsol.visitor.GJVoidVisitor<A> v, A argu) {
    v.visit(this, argu);
  }
}
