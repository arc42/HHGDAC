FROM jekyll/builder

LABEL version="0.2.1"
LABEL description="develop and generate documentation sites with AsciiDoctor"
LABEL vendor="arc42 and docToolChain"


COPY Gemfile .
# COPY Gemfile.lock .

RUN apk update && \
    apk add ncurses && \
    chmod a+w /srv/jekyll/ && \
    bundle install

WORKDIR /srv/jekyll
EXPOSE 4000

CMD ["bash"]
