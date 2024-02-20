# Sensory Underload

A different take on syntax highlighting for Sublime Text.

## Installation

### Through Package Control

_Thanks to [Justin Lam](https://github.com/ninth-dev) for this solution_.

- Open the command palette with `CMD + SHIFT + P`
- Select `Package Control: Add Repository`
- Enter https://github.com/ssanj/sensory-underload for the repository
- Open the command palette again with `CMD + SHIFT + P`
- Select `Package Control: Install Package`
- Choose `sensory-underload`

### Clone and Modify Locally

1. Clone this repo
1. Symlink checkout under your Sublime Text Packages directory

    You can find your packages directory by going to `Preferences` > `Browse Packages`.

    On Macos it should be `~/Library/Application Support/Sublime Text/Packages`


## Usage

You should now see the following UI colour schemes under `UI: Select Color Scheme` in the command palette:

### Generic colour schemes

1. Free Your Mind (No syntax highlighting)

![Free Your Mind](images/free-your-mind/free-your-mind-small.png)

### Scala-specific colour schemes

2. Scala to the Min (Minimal highlighting)

![Scala to the min](images/syntax/scala-to-the-min/scala-to-the-min-small.png)

3. Scala to the Mid (Slightly more highlighting)

![Scala to the mid](images/syntax/scala-to-the-mid/scala-to-the-mid-small.png)

4. Scala Light

![Scala to the mid](images/syntax/scala-light/scala-light-small.png)

Consider installing the `scala-sensory-underload.sublime-syntax` for your scala files for a more customised experience.

If you want to set one of the above colour schemes as the default for `scala` or `scala-sensory-underload` you can do
so by running the `Preferences: Settings - Syntax Specific` command while within a `scala` or `scala-sensory-underload`
file.

For example, the syntax-specific settings for using the `Scala to the Min.sublime-color-scheme` for scala files are:

```
{
    "color_scheme": "Scala to the Min.sublime-color-scheme",
    "font_size": 18
}
```

See [Colour Themes](docs/colour-schemes.md) for more information.

### Rust to the Min

![Rust to the Min](images/syntax/rust-to-the-min/rust-to-the-min-small.png)

### Python to the Min

![Python to the Min](images/syntax/python-to-the-min/python-to-the-min-small.png)

### Toml to the Min

![Toml to the Min](images/syntax/toml-to-the-min/toml-to-the-min-small.png)

## Markdown to the Min

![MD to the Min](images/syntax/md-to-the-min/md-to-the-min.png)

## JSON to the Min

![JSON to the Min](images/syntax/json-to-the-min/json-to-the-min.png)
