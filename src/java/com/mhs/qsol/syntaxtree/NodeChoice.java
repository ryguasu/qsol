//
// Generated by JTB 1.3.2
//

package com.mhs.qsol.syntaxtree;

/**
 * Represents a grammar choice, e.g. ( A | B )
 */
public class NodeChoice implements Node {
  public NodeChoice(Node node) {
    this(node, -1);
  }

  public NodeChoice(Node node, int whichChoice) {
    choice = node;
    which = whichChoice;
  }

  public void accept(com.mhs.qsol.visitor.Visitor v) {
    choice.accept(v);
  }

  public <R, A> R accept(com.mhs.qsol.visitor.GJVisitor<R, A> v, A argu) {
    return choice.accept(v, argu);
  }

  public <R> R accept(com.mhs.qsol.visitor.GJNoArguVisitor<R> v) {
    return choice.accept(v);
  }

  public <A> void accept(com.mhs.qsol.visitor.GJVoidVisitor<A> v, A argu) {
    choice.accept(v, argu);
  }

  public Node choice;
  public int which;
}
