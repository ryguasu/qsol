//
// Generated by JTB 1.3.2
//

package com.mhs.qsol.syntaxtree;

/**
 * The interface which NodeList, NodeListOptional, and NodeSequence implement.
 */
public interface NodeListInterface extends Node {
  public void addNode(Node n);

  public Node elementAt(int i);

  public java.util.Enumeration<Node> elements();

  public int size();

  public void accept(com.mhs.qsol.visitor.Visitor v);

  public <R, A> R accept(com.mhs.qsol.visitor.GJVisitor<R, A> v, A argu);

  public <R> R accept(com.mhs.qsol.visitor.GJNoArguVisitor<R> v);

  public <A> void accept(com.mhs.qsol.visitor.GJVoidVisitor<A> v, A argu);
}
