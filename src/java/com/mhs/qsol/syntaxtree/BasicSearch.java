//
// Generated by JTB 1.3.2
//

package com.mhs.qsol.syntaxtree;

/**
 * Grammar production: f0 -> ( BasicSearchType() )+
 */
public class BasicSearch implements Node {
  public NodeList f0;

  public BasicSearch(NodeList n0) {
    f0 = n0;
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
