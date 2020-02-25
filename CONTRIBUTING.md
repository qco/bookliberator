Please use the issue tracker to start discussions or ask questions
(see also our [code of conduct](CODE_OF_CONDUCT.md)).  You can submit
contributions via [pull
requests](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests).

# Coding Practices

## Change one thing at a time

Please make each commit be one logical change -- i.e., each commit
should be "about" one thing and not include parts of other changes.
Among other things, this means that a commit should not contain
unrelated whitespace changes that could distract someone trying to
read the commit's diff.

(Note that some text editors automatically trim trailing spaces at the
ends of lines, which leads to lots of spurious whitespace changes.
The Sublime Text editor does this; to turn that off, in Preferences ->
Settings -> User, set `trim_trailing_whitespace_on_save` to false.)

### Commit messages

Please use the commit message conventions described in
http://chris.beams.io/posts/git-commit/.  Include any issue numbers at
the end of the first (summary) line of the commit message, prefixed by
a #-mark.  If the commit is related to multiple issues, and you can't
fit them all on the summary line while keeping the line under 50
characters, then just put them in the body of the commit message.
Here's an example:

```
  Edit validations for blank field (#170)
      
  Fix validation to only raise an error if all the necessary
  conditions are met.
```
