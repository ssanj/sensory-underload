# Scala to the Mid

Contains all syntaxes from `Scala to the Min` plus some extras described below.

## Undesirable control flow

Syntax highlighting for the following undesirable control flow:

- return
- throw
- try
- catch
- finally

![Comments](images/syntax/scala-to-the-mid/scala-to-the-mid-flowcontrol-small.png)

<details>
  <summary>Config</summary>

```
{
    "name": "Undesirable controls (return, throw, try, catch, finally)",
    "scope": "keyword.control.Undesirable.scala",
    "foreground": "var(red2)",
     "font_style": "stippled_underline",
}
```
</details>

## Types

Syntax highlighting for the following additional types.


### Parameter and return types


![Types](images/syntax/scala-to-the-mid/scala-to-the-mid-param-and-return-types-small.png)

<details>
  <summary>Config</summary>

```
{
    "name": "Return and parameter types",
    "scope": "source.scala meta.class.body.scala support.class.scala, source.scala meta.block.scala support.class.scala",
    "foreground": "var(blue6)",
     "font_style": "stippled_underline",
}
```
</details>

### Constructor type parameters


![Types](images/syntax/scala-to-the-mid/scala-to-the-mid-constructor-parameter-types-small.png)

<details>
  <summary>Config</summary>

```
{
    "name": "Constructor parameter types",
    "scope": "source.scala support.class.scala",
    "font_style": "stippled_underline",
}
```
</details>
