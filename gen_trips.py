import argparse
from sys import argv
from random import randint


def parse_args(args):
    parser = argparse.ArgumentParser(
        description='Generate some random trips'
    )

    parser.add_argument('-o', '--out-file', type=str, required=True)
    parser.add_argument('-r', '--range', type=int, default=23)
    parser.add_argument('-n', '--num-trips', type=int, default=5)

    return parser.parse_args(args[1:])


def main(args):
    with open(args.out_file, 'w+') as f:
        for i in range(args.num_trips):
            start = randint(1, args.range)
            end = start
            while end == start:
                end = randint(1, args.range)

            f.write(str(start) + ' ' + str(end) + '\n')


if __name__ == '__main__':
    main(parse_args(argv))
