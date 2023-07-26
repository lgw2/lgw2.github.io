---
title: "test"
collection: research
---

## Install conda/mamba

### Option  1: install conda and then use it to install mamba

Follow the instructions here:
https://docs.conda.io/projects/conda/en/stable/user-guide/install/linux.html

You can use `wget` to download the miniconda installer.

Press `q` to get through the terms of service.

At the end of installation, you will be asked:

```
Do you wish the installer to initialize Miniconda3
by running conda init? [yes|no]
```

You can say `yes`, but you still need to restart the shell after:

```
==> For changes to take effect, close and re-open your current shell. <==
```

You could log out of the server and log back in, but a quicker way is to do:

```
source ~/.bashrc
```

If you don't want conda to activate automatically every time you login, run

```
conda config --set auto_activate_base false
```

Now, ensuring that you have the `base` conda environment open, run

```
https://mamba.readthedocs.io/en/latest/installation.html
```

to install mamba, which is just a faster version of conda (as in the first
version of this site:
https://mamba.readthedocs.io/en/latest/installation.html ).

Now, when we follow the instructions for the UM pipeline, we will use `mamba`
whenever they use `conda` and it will run much faster.

### Option 2: directly install mamba

TODO. It is potentially better to directly insteall mamba than to install it
through conda.

## Set up and run UM pipeline

Now, go to the UM pipeline page: https://github.com/goodest-goodlab/UM-CoV-Seq.
Clone the repo as they say. Make sure `conda` is activated.

We would like to load their pre-defined environment, but we use `mamba` instead
of `conda.` So we run

```
mamba env create --file envs/UM-CoV-Seq.yml

```

You can then activate the environment just as they do:

```
conda activate UM-CoV-Seq
```

Next, follow the instructions to get the nextclade resources. We'll call the
directory `nextclade-resources`, so you can run

```
nextclade dataset get --name sars-cov-2 --output-dir nextclade-resources
```

Copy the shared config file:
```
TODO
```

At this point, `snakemake` has a bug, so run

```
mamba install 'tabulate=0.8.10'
```

Similarly, one of the packages uses an old version of numpy, so run

```
mamba install `numpy<1.24`
```

Similarly, we should use an older version of `nextclade`, so run
```
mamba install -c bioconda 'nextclade=1.10'
```

We also need `ggplot2`, `ggrepl`, `dplyr`:

```
mamba install -c conda-forge r-ggplot2
mamba install -c bioconda r-ggrepel
mamba install -c conda-forge r-dplyr
mamba install -c conda-forge r-stringr
mamba install -c conda-forge r-tidyr
```

Now, run the pipeline with


```
snakemake -s pipe_reads_to_lineages.smk --configfile config_files/my_config.yaml --dry-run
```

If that works, then run

```
snakemake -s pipe_reads_to_lineages.smk --configfile /home/shared_files/example_UM_config.yaml --cores 1
```

If you want to copy the results to your local machine, run

```

```
